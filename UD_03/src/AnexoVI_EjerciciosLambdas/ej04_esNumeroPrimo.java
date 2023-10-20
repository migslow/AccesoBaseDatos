package AnexoVI_EjerciciosLambdas;

import java.util.Scanner;

/*
 * Verificar si un numero es primo
 */

public class ej04_esNumeroPrimo {

	static Scanner s = new Scanner(System.in);

	public static boolean esPrimo(int numero) {
		if (numero % 2 == 0) {
			return true;
		}
		return false;
	}

	interface Verificador {
		boolean verificar(int numero);
	}

	public static void main(String[] args) {
		System.out.println("Introduce el numero: ");
		int n = s.nextInt();
		Verificador ver = (numero) -> esPrimo(numero);
		if (ver.verificar(n)) {
			System.out.println("Es un numero primo");
		} else {
			System.out.println("No es un numero primo");
		}

	}

}
