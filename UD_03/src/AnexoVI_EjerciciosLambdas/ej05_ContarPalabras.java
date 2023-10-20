package AnexoVI_EjerciciosLambdas;

import java.util.Scanner;

/*
 * Contar palabras de una cadena de texto
 */

public class ej05_ContarPalabras {

	static Scanner s = new Scanner(System.in);

	interface Contador {
		int suma(String carac);
	}

	public static void main(String[] args) {
		System.out.println("Introduce la cadena de texto: ");
		String texto = s.nextLine();
		Contador contador = (cadena) -> cadena.split("\\s+").length;
        int resultado = contador.suma(texto);
        System.out.println("\nLa oración tiene " + resultado + " palabras.");
	}

}
