package FIS_FOS_REPASO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ej02 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(new File("FicherosRepaso\\archivo_origen.bin"));
			FileOutputStream fos = new FileOutputStream(new File("FicherosRepaso\\archivo_destino.bin"));
			
			int aux;
			while ((aux = fis.read()) != -1) {
				fos.write(aux);
			}
		} catch (IOException e) {
			System.out.println("A ocurrido un problema de E/S");
			e.printStackTrace();
		}

	}

}
