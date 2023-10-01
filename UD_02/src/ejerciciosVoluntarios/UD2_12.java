package ejerciciosVoluntarios;

import java.io.File;
import java.io.FilenameFilter;

public class UD2_12 {

	public static void main(String[] args) {
		if (args.length < 2) {
			System.out.println("No has introducido los argumentos necesarios");
			System.exit(-1);
		}

		String nombreDirectorio = args[0];
		String nombreExtension = args[1];

		File directorio = new File(nombreExtension);

		if (!directorio.exists() || !directorio.isDirectory()) {
			System.out.println("El directorio no existe.");
			System.exit(-1);
		}
		
		 File[] archivos = directorio.listFiles(new FilenameFilter(nombreExtension));

	}

}
