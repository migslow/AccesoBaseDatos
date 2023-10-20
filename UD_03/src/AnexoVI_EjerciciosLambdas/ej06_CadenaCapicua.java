package AnexoVI_EjerciciosLambdas;

import java.util.Scanner;

/*
 * Verificar si una cadena es capicua
 */

public class ej06_CadenaCapicua {

	static Scanner s = new Scanner(System.in);

	interface Verificardor {
		boolean verificar(String cadena);
	}

	public static void main(String[] args) {
		System.out.println("Introduce la cadena de texto: ");
		String texto = s.nextLine();
		Verificardor ver = (cadena) -> cadena.equals(new StringBuilder(cadena).reverse().toString());

		if (ver.verificar(texto)) {
			System.out.println("La cadena es capicúa");
		} else {
			System.out.println("La cadena no es capicúa");
		}

	}

}
