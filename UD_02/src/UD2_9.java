import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class UD2_9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Escribe el ID del profesor que quieres borrar: ");
		int id = s.nextInt();
		try {
			File fichero = new File("Ficheros\\ProfesFPSierraGuara.dat");
			RandomAccessFile file = new RandomAccessFile(fichero, "rw");
			
			long posicion = (id-1) * 56;
			
			if(posicion >= 0 && posicion < file.length()) {
				file.seek(posicion);
				byte [] datosVacios = new byte[56];
				file.write(datosVacios);
				System.out.println("Profesor con ID: " + id + " borrado");
			} else {
				System.out.println("ID desconocido");
			}
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
