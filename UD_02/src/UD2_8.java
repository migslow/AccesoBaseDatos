import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class UD2_8 {
	static Scanner s = new Scanner(System.in);
	static ArrayList<Profesor> lista = new ArrayList<Profesor>();

	public static void main(String[] args) throws ClassNotFoundException {
		File f = new File("Ficheros\\antiguedad.dat_obj.dat");
		if (f.exists()) {
			try {
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
				try {
					while (true) {
						Profesor profesor = (Profesor) ois.readObject();
						lista.add(profesor);
					}
				} catch (EOFException e) {
					System.out.println("Final del fichero");
					ois.close();
				}
			} catch (IOException e) {
				System.out.println("Ha ocurrido un error" + e.getMessage());
			}
		}

		while (true) {
			System.out.println("============MENU============");
			System.out.println("1. Añadir profesor");
			System.out.println("2. Escritura fichero");
			System.out.println("3. Consulta fichero");
			System.out.println("4. Salir programa");
			System.out.println("Introduce un numero entre 1 y 4: ");
			int opcion = s.nextInt();
			switch (opcion) {
			case 1:
				anyadirProfesor();
				break;
			case 2:
				try {
					escrituraFichero("Ficheros\\antiguedad.dat_obj.dat");
				} catch (IOException e) {
					System.out.println("Error al escribir en el fichero: " + e.getMessage());
				}
				break;
			case 3:
				consultarLista();
				break;
			case 4:
				System.exit(0); // Salir del programa
				break;
			default:
				System.out.println("No has introducido un numero entre 1 y 4");
				break;
			}
		}
	}

	public static void anyadirProfesor() {
		System.out.println("Introduce el nombre: ");
		String nombre = s.next();
		System.out.println("Introduce la antigüedad: ");
		int ant = s.nextInt();
		Profesor profesor = new Profesor(nombre, ant);
		lista.add(profesor);
	}

	public static void escrituraFichero(String ruta) throws IOException {
		FileOutputStream fos = new FileOutputStream(ruta);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		for (Profesor p : lista) {
			oos.writeObject(p);
		}
		oos.close();
	}

	public static void consultarLista() {
		System.out.println("\nProfesores en la lista: ");
		for (Profesor p : lista) {
			System.out.println("Nombre: " + p.getNombre() + ", Antigüedad: " + p.getAntiguedad());
		}
	}

}
