package AnexoVI_EjerciciosLambdas;

import java.util.Scanner;

/*
 * Convertir una lista de cadenas a minúsculas.
 */

public class ej03_cadenaMinusculas {
	
	static Scanner s = new Scanner(System.in);
	
	interface Convertidor{
		String convertir(String cadena);
	}

	public static void main(String[] args) {
		System.out.println("Introduce la cadena de texto: ");
		String texto = s.nextLine();
		Convertidor con = (cadena) -> cadena.toLowerCase();
		System.out.println("\nEl texto convertido a minusculas es: " + con.convertir(texto));

	}

}
