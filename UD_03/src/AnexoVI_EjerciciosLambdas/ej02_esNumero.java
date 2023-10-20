package AnexoVI_EjerciciosLambdas;

import java.util.Scanner;

/*
 * Verificar si es un numero entero
 */

public class ej02_esNumero {

	static Scanner s = new Scanner(System.in);

	public static boolean isNumeric(String cadena) {
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	interface Verificador {
		boolean verificar(String cadena);
	}

	public static void main(String[] args) {
		System.out.println("Introduce el numero: ");
		String n = s.nextLine();
		Verificador ver = (cadena) -> isNumeric(cadena);

		if (ver.verificar(n)) {
			System.out.println("Es un numero entero");
		} else {
			System.out.println("No es un numero entero");
		}

	}

}
