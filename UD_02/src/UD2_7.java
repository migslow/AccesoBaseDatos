import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class UD2_7 {

	public static void main(String[] args) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("puntuacion.dat"));
			for (int i = 0; i < 20; i++) {
				int numero = (int) (Math.random() * 5 + 1);
				bw.write(Integer.toString(numero));
				bw.newLine();
			}
			bw.close();
			BufferedReader br = new BufferedReader(new FileReader("puntuacion.dat"));
			String linea;
			int[] frecuenciaNumeros = new int[6];

			while ((linea = br.readLine()) != null) {
				int numero = Integer.parseInt(linea);
				System.out.println(numero);
				frecuenciaNumeros[numero]++;
			}
			br.close();

			for (int i = 1; i <= 5; i++) {
				System.out.println("El número " + i + " se repite " + frecuenciaNumeros[i] + " veces.");
			}
		} catch (IOException e) {
			System.out.println("Ha ocurrido un problema de entrada y salida: " + e.getMessage());
		}
	}
}
