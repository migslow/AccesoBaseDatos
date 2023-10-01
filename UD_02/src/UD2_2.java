import java.io.File;

public class UD2_2 {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("No has introducido ningun argumento");
			System.exit(-1);
		}
		for (int i = 0; i < args.length; i++) {
			File f = new File(args[i]);
			if (f.exists()) {
				System.out.println("Ruta: " + args[i]);
				if (f.isDirectory()) {
					System.out.println("Existe el directorio.");
				} else if (f.isFile()) {
					System.out.println("Existe el fichero.");
				}
			} else {
				System.out.println("La ruta " + f + "no existe");
			}
		}

	}

}