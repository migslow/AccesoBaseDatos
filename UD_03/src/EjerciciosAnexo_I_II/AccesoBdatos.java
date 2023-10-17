/*
 * Revisado para versión 8.0.19 de MySQL 
 * Alberto Carrera Martín
 * y añadido comentarios el 17 de marzo de 2020
 * 
 */
package EjerciciosAnexo_I_II;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class AccesoBdatos {
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String database = "baloncesto";
	private static String hostname = "localhost";
	private static String port = "3306";
	private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?serverTimezone=Europe/Madrid";
	private static String username = "root";
	private static String password = "ROOT";
	
	public Connection conecta;
	static ResultSet res;
	
	public void conectar() throws SQLException, ClassNotFoundException {
		Class.forName(driver);
		conecta = DriverManager.getConnection(url, username, password);
	}
	
	public ResultSet consulta(String cadenaSQL) throws SQLException {
		Statement consulta = conecta.createStatement();
		ResultSet reg = consulta.executeQuery(cadenaSQL);
		return reg;
	}
	
	public int insertar(int id, String nombre, int estatura, int edad, String localidad) {
		int resultado;
		String sql = "insert into socio values(?,?,?,?,?)";
		try {
			PreparedStatement inserta = conecta.prepareStatement(sql);
			inserta.setInt(1, id);
			inserta.setString(2, nombre);
			inserta.setInt(3, estatura);
			inserta.setInt(4, edad);
			inserta.setString(5, localidad);
			
			resultado = inserta.executeUpdate();
			inserta.close();
			
			return resultado;
			
		} catch (SQLException e) {
			return 0;
		}
	}
	
	public int borrarSocio(int id) {
		String sql = "DELETE FROM socio WHERE socioID = ?";
		try {
			PreparedStatement borra = conecta.prepareStatement(sql);
			borra.setInt(1, id);
			
			return borra.executeUpdate();
		} catch (SQLException e) {
			return -1;
		}
	}
	
	public int actualizar(String nombre, int estatura, int edad, String localidad, int id) {
		String sql = "UPDATE socio SET nombre = ?, estatura = ?, edad = ?, localidad = ? WHERE socioID = ?";
		try {
			PreparedStatement actualiza = conecta.prepareStatement(sql);
			actualiza.setString(1, nombre);
			actualiza.setInt(2, estatura);
			actualiza.setInt(3, edad);
			actualiza.setString(4, localidad);
			actualiza.setInt(5, id);
			
			return actualiza.executeUpdate();
			
		} catch (SQLException e) {
			return -1;
		}
		
	}
	
	public int ultimoID() {
		int ultimoID = -1;
		String sql = "SELECT MAX(socioID) FROM socio";
		
		try {
			PreparedStatement consulta = conecta.prepareStatement(sql);
			ResultSet rs = consulta.executeQuery();
			
			if(rs.next()) {
				ultimoID = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ultimoID;
	}
	
	public void desconectar() throws SQLException {
		if (conecta !=null) {
			conecta.close();
		}
	}
}