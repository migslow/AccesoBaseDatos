import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class UD2_7 {

	public static void main(String[] args) {
		int contador = 0;
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("Ficheros\\puntuacion.dat"));
			BufferedReader br = new BufferedReader(new FileReader("Ficheros\\puntuacion.dat"));
			for (int i = 0; i <= 20; i++) {
				int numeros = (int) (Math.random() * 5 + 1);
				bw.write(Integer.toString(numeros));
				bw.newLine();
			}
			bw.close();

			String aux;
			while ((aux = br.readLine()) != null) {
				System.out.println(aux);
			}
			br.close();
		} catch (Exception e) {
			System.out.println("Ha ocurrido un problema de entrada y salida");
		}

	}

}
