import java.io.File;
import java.io.IOException;

public class UD2_3 {

	public static void main(String[] args) throws IOException {
		boolean resultado;
		File directorio = new File("C:\\DAM2");
		File fichero = new File("C:\\DAM2\\alberto.txt");
		resultado = directorio.mkdir();
		if (resultado) {
			System.out.println("El directorio se ha creado");
		} else {
			System.out.println("El directorio no se ha creado");
			System.exit(-1);
		}
		try {
			resultado = fichero.createNewFile();
			if (resultado) {
				System.out.println("Archivo creado");
			} else {
				System.out.println("No se ha podido crear el archivo");
			}
		} catch (IOException e) {
			System.out.println("Se ha producido un error: " + e.getMessage());
		}
		
		resultado = fichero.delete();
		if (resultado) {
			System.out.println("El fichero se ha eliminado");
		} else {
			System.out.println("El fichero no se ha podido eliminar");
		}

		resultado = directorio.delete();
		if (resultado) {
			System.out.println("El directorio se ha eliminado");
		} else {
			System.out.println("El directorio no se ha podido eliminar");
		}

	}

}
