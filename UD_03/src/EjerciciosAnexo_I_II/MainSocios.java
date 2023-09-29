package EjerciciosAnexo_I_II;

import java.sql.SQLException;

public class MainSocios {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		AccesoBdatosSocio abd = new AccesoBdatosSocio();
		
		abd.conectar();
		
		abd.exportarJson();
		
		abd.desconectar();

	}

}
