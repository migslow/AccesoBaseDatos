import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class UD2_5 {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("No has introducido ningun argumento");
			System.exit(-1);
		}

		String nombreFichero = args[0];
		String nombreFicheroOrdenado = nombreFichero + "_sort.txt";
		try {
			ArrayList<String> lineas = new ArrayList<>();
			BufferedReader br = new BufferedReader(new FileReader(nombreFichero));
			String aux;
			while ((aux = br.readLine()) != null) {
				lineas.add(aux);
			}
			br.close();
			Collections.sort(lineas);
			BufferedWriter bw = new BufferedWriter(new FileWriter(nombreFicheroOrdenado));
			for (String lineaOrdenada : lineas) {
				bw.write(lineaOrdenada);
				bw.newLine();
			}
			bw.close();
		} catch (IOException e) {
			System.out.println("A ocurrido un problema");
		}

	}

}
