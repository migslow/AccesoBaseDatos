package UD01;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

public class Pregunta3 {
	public static void main(String[] args) throws IOException {
		try {
			Gson gson = new Gson();
			String sFichero;
			sFichero = new String(Files.readAllBytes(Paths.get("Ficheros\\empleados.json")));
			if (sFichero.isEmpty()) {
				System.out.println("El fichero esta vacio");
			} else {
				List<Empleado> empleados = Arrays.asList(gson.fromJson(sFichero, Empleado[].class));
				int contador = 0;
				for (Empleado e : empleados) {
					contador++;
				}
				System.out.println("Hay " + contador + " empleados");

				double media = 0;
				for (Empleado e : empleados) {
					media = e.getSalario() + contador;
				}
				System.out.println("El salario medio es: " + media);
			}
		} catch (EOFException e) {
			System.out.println("Fin del fichero");
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el fichero");
			e.printStackTrace();
		}
	} // del main

} // de la clase
