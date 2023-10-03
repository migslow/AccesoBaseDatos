package BR_BW_REPASO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ej02 {

	public static void main(String[] args) {
		if (args.length < 2) {
			System.out.println("No has introducido los argumentos suficientes");
			System.exit(-1);
		}

		String archivo1 = args[0];
		String archivo2 = args[1];

		try {
			BufferedReader br = new BufferedReader(new FileReader(archivo1));
			BufferedWriter bw = new BufferedWriter(new FileWriter(archivo2));

			String linea;
			int contadorPalabras = 0;

			while ((linea = br.readLine()) != null) {
				String[] palabras = linea.split("\\s+");
				contadorPalabras = contadorPalabras + palabras.length;
			}

			bw.write("En el texto hay " + contadorPalabras + " palabras.");

			br.close();
			bw.close();
		} catch (IOException e) {
			System.out.println("A ocurrido un problema de E/S");
		}

	}

}
