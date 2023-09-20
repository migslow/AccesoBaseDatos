import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class UD2_7 {

	public static void main(String[] args) {
		int contador = 0;
		try {
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("Ficheros\\puntuacion.dat"));
			DataInputStream dis = new DataInputStream(new FileInputStream("Ficheros\\puntuacion.dat"));
			int aux;
			for (int i = 0; i <= 20; i++) {
				aux = (int) (Math.random() * 5 + 1);
				dos.writeInt(aux);
			}
			dos.close();

			while (true) {
				System.out.println("Numero: " + dis.readInt());
			}

		} catch (Exception e) {
			System.out.println("A ocurrido un problema de E/S");
		}

	}

}
