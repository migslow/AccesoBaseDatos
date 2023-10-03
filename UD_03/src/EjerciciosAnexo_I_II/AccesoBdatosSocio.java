package EjerciciosAnexo_I_II;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JDialog;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.mysql.cj.x.protobuf.MysqlxPrepare.Prepare;

public class AccesoBdatosSocio {

	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String database = "baloncesto";
	private static String hostname = "localhost";
	private static String port = "3306";
	private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database
			+ "?serverTimezone=Europe/Madrid";
	private static String username = "root";
	private static String password = "ROOT";
	private Connection conecta;

	public void conectar() throws SQLException, ClassNotFoundException {
		Class.forName(driver);
		conecta = DriverManager.getConnection(url, username, password);
	}

	public boolean exportarJson() {
		try {
			PreparedStatement consulta = conecta.prepareStatement("select * from socio");
			ResultSet rs = consulta.executeQuery();
			ArrayList<Socio> socios = new ArrayList<Socio>();
			while (rs.next()) {
				Socio socio = new Socio();
				socio.setSocioID(rs.getInt("socioID"));
				socio.setNombre(rs.getString("nombre"));
				socio.setEstatura(rs.getInt("estatura"));
				socio.setEdad(rs.getInt("edad"));
				socio.setLocalidad(rs.getString("localidad"));
				socios.add(socio);
			}
			rs.close();
			consulta.close();
			Gson gson = new Gson();
			String json = gson.toJson(socios);
			try (FileWriter fw = new FileWriter("Ficheros\\socios.json")) {
				fw.write(json);
			}
			return true;
		} catch (SQLException | IOException e) {
			System.out.println("A ocurrido un problema " + e.getMessage());
			return false;
		}
	}

	public int actualizarSocio(String nombre, int estatura, int edad, String localidad) {
		try {
			PreparedStatement actualizar = conecta
					.prepareStatement("update socio set nombre=?, estatura=?, edad=?, localidad=? where socioID=?");
			actualizar.setString(1, nombre);
			actualizar.setInt(2, estatura);
			actualizar.setInt(3, edad);
			actualizar.setString(4, localidad);
			return actualizar.executeUpdate();
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			return 0;
		}
	}
	
	public int borrarSocio(int numero) {
		try {
			PreparedStatement eliminar = conecta.prepareStatement("delete from socio where SocioID=?");
			eliminar.setInt(1, numero);
			eliminar.executeUpdate();
			eliminar.close();
			return JDialog;
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta");
			return e.getErrorCode();
		}
	}

	public void desconectar() throws SQLException, ClassNotFoundException {
		conecta = null;
	}

}
