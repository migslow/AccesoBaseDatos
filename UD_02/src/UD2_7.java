import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class UD2_7 {

	public static void main(String[] args) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("Ficheros\\puntuacion.dat"));
			BufferedReader br = new BufferedReader(new FileReader("Ficheros\\puntuacion.dat"));
			for (int i = 0; i <= 20; i++) {
				int numeros = (int) (Math.random() * 5 + 1);
				bw.write(numeros);
			}
			bw.close();
			
			
		} catch (Exception e) {
			System.out.println("A ocurrido un problema de entrada y salida");
		}

	}

}
