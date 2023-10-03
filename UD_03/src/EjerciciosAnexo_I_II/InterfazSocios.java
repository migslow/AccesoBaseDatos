package EjerciciosAnexo_I_II;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class InterfazSocios {

	private JFrame frame;
	private JTextField textFieldSocio;
	private JTextField textFieldNombre;
	private JTextField textFieldEstatura;
	private JTextField textFieldEdad;
	private JTextField textFieldLocalidad;
	private JTextField textFieldBuscar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazSocios window = new InterfazSocios();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InterfazSocios() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabelSocio = new JLabel("Socio");
		lblNewLabelSocio.setBounds(32, 44, 46, 14);
		frame.getContentPane().add(lblNewLabelSocio);

		JLabel lblNewLabelNombre = new JLabel("Nombre");
		lblNewLabelNombre.setBounds(32, 66, 46, 14);
		frame.getContentPane().add(lblNewLabelNombre);

		JLabel lblNewLabelEstatura = new JLabel("Estatura");
		lblNewLabelEstatura.setBounds(32, 90, 46, 14);
		frame.getContentPane().add(lblNewLabelEstatura);

		JLabel lblNewLabelEdad = new JLabel("Edad");
		lblNewLabelEdad.setBounds(32, 113, 46, 14);
		frame.getContentPane().add(lblNewLabelEdad);

		JLabel lblNewLabelLocalidad = new JLabel("Localidad");
		lblNewLabelLocalidad.setBounds(32, 138, 46, 14);
		frame.getContentPane().add(lblNewLabelLocalidad);

		textFieldSocio = new JTextField();
		textFieldSocio.setBounds(101, 41, 62, 20);
		frame.getContentPane().add(textFieldSocio);
		textFieldSocio.setColumns(10);

		textFieldNombre = new JTextField();
		textFieldNombre.setColumns(10);
		textFieldNombre.setBounds(101, 63, 174, 20);
		frame.getContentPane().add(textFieldNombre);

		textFieldEstatura = new JTextField();
		textFieldEstatura.setColumns(10);
		textFieldEstatura.setBounds(101, 87, 46, 20);
		frame.getContentPane().add(textFieldEstatura);

		textFieldEdad = new JTextField();
		textFieldEdad.setColumns(10);
		textFieldEdad.setBounds(101, 110, 39, 20);
		frame.getContentPane().add(textFieldEdad);

		textFieldLocalidad = new JTextField();
		textFieldLocalidad.setColumns(10);
		textFieldLocalidad.setBounds(101, 135, 86, 20);
		frame.getContentPane().add(textFieldLocalidad);

		textFieldBuscar = new JTextField();
		textFieldBuscar.setBounds(322, 24, 86, 20);
		frame.getContentPane().add(textFieldBuscar);
		textFieldBuscar.setColumns(10);

		JButton btnNewButtonBuscar = new JButton("Buscar");
		btnNewButtonBuscar.setBounds(322, 62, 89, 23);
		frame.getContentPane().add(btnNewButtonBuscar);
		btnNewButtonBuscar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String searchText = textFieldBuscar.getText();
				try {
					Connection con = DriverManager
							.getConnection("jdbc:mysql://localhost:3306/baloncesto?serverTimezone=UTC", "root", "ROOT");
					String query = "SELECT socioID, nombre, estatura, edad, localidad FROM socio WHERE socioID=?";
					PreparedStatement stmt = con.prepareStatement(query);
					int id = Integer.parseInt(searchText);
					stmt.setInt(1, id);

					ResultSet rs = stmt.executeQuery();

					if (rs.next()) {
						textFieldSocio.setText(rs.getString("socioID"));
						textFieldNombre.setText(rs.getString("nombre"));
						textFieldEstatura.setText(rs.getString("estatura"));
						textFieldEdad.setText(rs.getString("edad"));
						textFieldLocalidad.setText(rs.getString("localidad"));

					} else {
						textFieldSocio.setText("");
						textFieldNombre.setText("");
						textFieldEstatura.setText("");
						textFieldEdad.setText("");
						textFieldLocalidad.setText("");
					}

					rs.close();
					stmt.close();
					con.close();
				} catch (SQLException ex) {
					ex.printStackTrace();
				} catch (NumberFormatException ex) {
					textFieldNombre.setText("");
					textFieldEstatura.setText("");
				}
			}
		});

		JLabel lblNewLabelcm = new JLabel("cm.");
		lblNewLabelcm.setBounds(153, 90, 46, 14);
		frame.getContentPane().add(lblNewLabelcm);

		JLabel lblNewLabeledad = new JLabel("edad.");
		lblNewLabeledad.setBounds(153, 113, 46, 14);
		frame.getContentPane().add(lblNewLabeledad);

		JButton btnNewButtonActualizar = new JButton("Actualizar");
		btnNewButtonActualizar.setBounds(322, 104, 89, 23);
		frame.getContentPane().add(btnNewButtonActualizar);

		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(322, 146, 89, 23);
		frame.getContentPane().add(btnBorrar);

		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.setBounds(322, 190, 89, 23);
		frame.getContentPane().add(btnNuevo);

		JButton btnNewButtonAnterior = new JButton("Anterior");
		btnNewButtonAnterior.setEnabled(false);
		btnNewButtonAnterior.setBounds(75, 211, 89, 23);
		frame.getContentPane().add(btnNewButtonAnterior);

		JButton btnNewButtonSiguiente = new JButton("Siguiente");
		btnNewButtonSiguiente.setEnabled(false);
		btnNewButtonSiguiente.setBounds(186, 211, 89, 23);
		frame.getContentPane().add(btnNewButtonSiguiente);
		btnNewButtonActualizar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});
		{

		}

	}
}
