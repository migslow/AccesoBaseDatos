package Anexo_I_II;

import java.sql.SQLException;

public class Main4 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		AccesoBdatos abd = new AccesoBdatos();
		//
		abd.conectar();
		//

		System.out.println("Departamento 10");
		System.out.println(abd.consultarUno(10));

		System.out.println("-----------------------------------");
		System.out.println("Departamento 90");
		System.out.println(abd.consultarUno(90));

		abd.desconectar();

	}

}
