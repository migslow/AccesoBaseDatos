package BR_BW_REPASO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ej01 {

	public static void main(String[] args) {
		if (args.length < 2) {
			System.out.println("No has introducido los argumentos suficientes");
			System.exit(-1);
		}

		String archivoOrigen = args[0];
		String archivoDestino = args[1];

		try {
			BufferedReader br = new BufferedReader(new FileReader(archivoOrigen));
			BufferedWriter bw = new BufferedWriter(new FileWriter(archivoDestino));

			String aux;
			while ((aux = br.readLine()) != null) {
				bw.write(aux);
			}
			br.close();
			bw.close();
		} catch (IOException e) {
			System.out.println("A ocurrido un problema de E/S");
			e.printStackTrace();
		}

	}

}
