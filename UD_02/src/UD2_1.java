import java.io.File;

public class UD2_1 {

	public static void main(String[] args) {
		File f = new File("C:\\Windows");
		File[] archivos = f.listFiles();
		for (File archivo : archivos) {
			if (archivo.isHidden()) {
				System.out.println("El nombre: " + archivo.getName());
				System.out.println("La longitud: " + archivo.length());
				System.out.println("¿Se puede leer?: " + archivo.canRead());
				System.out.println("¿Se puede escribir?: " + archivo.canWrite());
				System.out.println("=============================================");
			}
		}
	}
}
