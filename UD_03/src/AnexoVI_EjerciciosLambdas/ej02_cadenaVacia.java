package AnexoVI_EjerciciosLambdas;

import java.util.Scanner;

/*
 * Verificar si una cadena está vacía.
 */

public class ej02_cadenaVacia {

	static Scanner s = new Scanner(System.in);

	interface Verificador {
		boolean verificar(String cadena);
	}

	public static void main(String[] args) {
		System.out.println("Introduce la cadena de texto: ");
		String texto = s.nextLine();
		Verificador ver = (cadena) -> cadena.isEmpty();

		if (ver.verificar(texto)) {
			System.out.println("La cadena de texto esta vacia");
		} else {
			System.out.println("La cadena de texto no esta vacia");
		}

	}

}
