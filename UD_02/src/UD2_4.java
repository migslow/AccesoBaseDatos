import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UD2_4 {

	public static void main(String[] args) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("Ficheros\\pares.txt"));
			BufferedReader br = new BufferedReader(new FileReader("Ficheros\\pares.txt"));
			for (int i = 0; i <= 500; i++) {
			    if (i % 2 == 0) {
			        bw.write("Numero: " + i + "\n");
			    }
			}
			bw.close();
			
			String aux;
			while((aux = br.readLine()) != null) {
				System.out.println(aux);
			}
			br.close();
		} catch (IOException e) {
			System.out.println("Ha ocurrido un problema de E - S");
		}

	}

}
