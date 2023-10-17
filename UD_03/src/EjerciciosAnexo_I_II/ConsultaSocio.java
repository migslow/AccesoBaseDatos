package EjerciciosAnexo_I_II;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ConsultaSocio extends JFrame implements ActionListener {

	static Scanner s  = new Scanner(System.in);
	private static AccesoBdatos abd=new AccesoBdatos();
	private static ResultSet rs = null;
	private static int ultimo = 0;
	private static int ins;
	
	Container panel;
	JTextField txtBuscar, txtSocio, txtNombre, txtEstatura, txtEdad, txtLoc;
	JLabel lb_socio, lb_nombre, lb_estatura, lb_edad, lb_loc, lb_cm, lb_anyos, lb_tex;
	JButton btBuscar, btAnt, btSig, btAct, btBorrar, btCrear;
	
	public ConsultaSocio() {
		super("Búsqueda de socios por localidad");
		panel = getContentPane();
		panel.setLayout(null);
		
		lb_socio = new JLabel("Socio");
		lb_socio.setBounds(30, 40, 50, 20);
		panel.add(lb_socio);
		
		txtSocio = new JTextField();
		txtSocio.setBounds(70, 40, 50, 20);
		panel.add(txtSocio);
		txtSocio.setEditable(false);
		
		lb_nombre = new JLabel("Nombre");
		lb_nombre.setBounds(17, 70, 50, 20);
		panel.add(lb_nombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(70, 70, 120, 20);
		panel.add(txtNombre);
		txtNombre.setEditable(true);
		
		lb_estatura = new JLabel("Estatura");
		lb_estatura.setBounds(14, 100, 50, 20);
		panel.add(lb_estatura);
		
		txtEstatura = new JTextField();
		txtEstatura.setBounds(70, 100, 40, 20);
		panel.add(txtEstatura);
		txtEstatura.setEditable(true);
		
		lb_cm = new JLabel("cm.");
		lb_cm.setBounds(115, 100, 40, 20);
		panel.add(lb_cm);
		
		lb_edad = new JLabel("Edad");
		lb_edad.setBounds(33, 130, 50, 20);
		panel.add(lb_edad);
		
		txtEdad = new JTextField();
		txtEdad.setBounds(70, 130, 40, 20);
		panel.add(txtEdad);
		txtEdad.setEditable(true);
		
		lb_anyos = new JLabel("años");
		lb_anyos.setBounds(115, 130, 40, 20);
		panel.add(lb_anyos);
		
		lb_loc = new JLabel("Localidad");
		lb_loc.setBounds(14, 160, 50, 20);
		panel.add(lb_loc);
		
		txtLoc = new JTextField();
		txtLoc.setBounds(70, 160, 100, 20);
		panel.add(txtLoc);
		txtLoc.setEditable(true);
		
		txtBuscar = new JTextField();
		txtBuscar.setBounds(280, 40, 80, 20);
		panel.add(txtBuscar);
		
		btBuscar = new JButton("Buscar");
		btBuscar.setBounds(280, 70, 80, 20);
		btBuscar.addActionListener(this);
		panel.add(btBuscar);
		
		btAnt = new JButton("Anterior");
		btAnt.setBounds(10, 220, 90, 20);
		btAnt.addActionListener(this);
		panel.add(btAnt);
		btAnt.setEnabled(false);
		
		btSig = new JButton("Siguiente");
		btSig.setBounds(105, 220, 90, 20);
		btSig.addActionListener(this);
		panel.add(btSig);
		btSig.setEnabled(false);
		
		btAct = new JButton("Actualizar");
		btAct.setBounds(200, 220, 100, 20);
		btAct.addActionListener(this);
		panel.add(btAct);
		btAct.setEnabled(false);
		
		btBorrar = new JButton("Borrar");
		btBorrar.setBounds(305, 220, 100, 20);
		btBorrar.addActionListener(this);
		panel.add(btBorrar);
		btBorrar.setEnabled(false);
		
		btCrear = new JButton("Crear");
		btCrear.setBounds(150, 250, 100, 20);
		btCrear.addActionListener(this);
		panel.add(btCrear);
		btCrear.setEnabled(true);
		
		lb_tex = new JLabel("");
		lb_tex.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lb_tex.setBounds(150, 190, 120, 20);
		panel.add(lb_tex);
		
		setSize(450, 320);
		setVisible(true);
		setDefaultCloseOperation(0);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				try {
					abd.desconectar();
					System.out.println("desconectado");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.exit(0);
			}
		});
	}
	
	
	public static void main(String[] args) {
		ConsultaSocio ventana = new ConsultaSocio();
		try {
			abd.conectar();
			System.out.println("Conectado");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String cad;
		try {
		if(e.getSource() == btBuscar) {
			if(txtBuscar.getText().isEmpty()) {
				cad = "SELECT * FROM socio";
			} else {
				cad = "SELECT * FROM socio where localidad = '"+ txtBuscar.getText() + "'";
			}
			rs = abd.consulta(cad);
			rs.last();
			ultimo = rs.getRow();
			if(ultimo < 1) {
				JOptionPane.showMessageDialog(panel, "No existen registros en " + txtBuscar.getText(), "error", 
						JOptionPane.INFORMATION_MESSAGE);
				btAnt.setEnabled(false);
				btSig.setEnabled(false);
			} else {
				rs.first();
			}
		} // btBuscar
		if(e.getSource() == btAnt) {
			if(rs.isFirst()) {
				JOptionPane.showMessageDialog(panel, "No existen registros anteriores", "primer socio", 
						JOptionPane.INFORMATION_MESSAGE, null);
			} else {
				rs.previous();
			}
		} // btAnt
		if(e.getSource() == btSig) {
			if(rs.isLast()) {
				JOptionPane.showMessageDialog(panel, "No existen siguientes registros", "último socio", 
						JOptionPane.INFORMATION_MESSAGE, null);
			} else {
				rs.next();
			}
		} //btSig
		if(e.getSource() == btBorrar) {
			String idTexto = txtSocio.getText();
			if(idTexto.isEmpty()) {
				JOptionPane.showMessageDialog(null, "No hay ningún socio", "Advertencia", JOptionPane.WARNING_MESSAGE);
			} else {
				try {
					int idSocio = Integer.parseInt(idTexto);
					abd.borrarSocio(idSocio);
					JOptionPane.showMessageDialog(null, "Socio borrado con éxito", "Borrado", JOptionPane.INFORMATION_MESSAGE);
					System.exit(1);
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		} //btBorrar
		if(e.getSource() == btAct) {
			String nombreNuevo = txtNombre.getText();
			int estaturaNueva = Integer.parseInt(txtEstatura.getText());
			int edadNueva = Integer.parseInt(txtEdad.getText());
			String locNueva = txtLoc.getText();
			int socioID = Integer.parseInt(txtSocio.getText());
			if(txtNombre.getText().isEmpty() || txtEstatura.getText().isEmpty() || txtEdad.getText().isEmpty() || txtLoc.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Uno de los campos está vacío", "Error", JOptionPane.ERROR_MESSAGE);
				System.exit(-1);
			} else {
				abd.actualizar(nombreNuevo, estaturaNueva, edadNueva, locNueva, socioID);
				JOptionPane.showMessageDialog(null, "Socio actualizado con éxito", "Actualizado", JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			}
		} //btAct
		if(e.getSource() == btCrear) {
			int socioID = abd.ultimoID() + 1;
			String name = txtNombre.getText();
			int est = Integer.parseInt(txtEstatura.getText());
			int ed = Integer.parseInt(txtEdad.getText());
			String loc = txtLoc.getText();
			if(txtNombre.getText().isEmpty() || txtEstatura.getText().isEmpty() || txtEdad.getText().isEmpty() || txtLoc.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Uno de los campos está vacío", "Error", JOptionPane.ERROR_MESSAGE);
				System.exit(-1);
			} else {
				abd.insertar(socioID, name, est, ed, loc);
				JOptionPane.showMessageDialog(null, "Socio creado con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
			}
		} //btCrear
		
		txtSocio.setText(rs.getString(1));
		txtNombre.setText(rs.getString(2));
		txtEstatura.setText(rs.getString(3));
		txtEdad.setText(rs.getString(4));
		txtLoc.setText(rs.getString(5));
		btAnt.setEnabled(true);
		btSig.setEnabled(true);
		btBorrar.setEnabled(true);
		btAct.setEnabled(true);
		btCrear.setEnabled(false);
		lb_tex.setText("Socio " + String.valueOf(rs.getRow()) + " de " + String.valueOf(ultimo));
	} catch(SQLException sqle) {
		
	}

}	
}
