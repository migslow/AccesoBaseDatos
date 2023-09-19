import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UD2_6 {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("No has introducido ningun argumento");
			System.exit(-1);
		}

		String nombreFichero = args[0];
		String palabraEncontrar = args[1];
		int contador = 0;
		try {
			BufferedReader br = new BufferedReader(new FileReader(nombreFichero));
			String aux;
			while ((aux = br.readLine()) != null) {
				System.out.println("El texto es: ");
				System.out.println(aux);
			}
			br.close();

			String[] palabras = aux.split("\\s+");
			for (String palabra : palabras) {
				if (palabra.equalsIgnoreCase(palabraEncontrar)) {
					contador++;
				}
			}
			System.out.println("La palabra " + palabraEncontrar + " aparece " + contador);
		} catch (IOException e) {
			System.out.println("A ocurrido un problema de entrada y salida");
		}

	}

}
