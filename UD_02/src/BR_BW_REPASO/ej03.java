package BR_BW_REPASO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ej03 {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("FicherosRepaso\\textoOcurrencias.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("FicherosRepaso\\textoCompleto.txt"));

			String aux;
			while ((aux = br.readLine()) != null) {
				bw.write(aux.replaceAll("ke", "que"));
			}

			br.close();
			bw.close();

		} catch (IOException e) {
			System.out.println("A ocurrido un problema de E/S");
			e.printStackTrace();
		}

	}

}
