package FIS_FOS_REPASO;

import java.io.FileInputStream;
import java.io.IOException;

public class ej01 {

	public static void main(String[] args) {
		String archivo = "archivo.bin";

		try (FileInputStream fis = new FileInputStream(archivo)) {
			int byteLeido;
			while ((byteLeido = fis.read()) != -1) {
				System.out.print(byteLeido);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
