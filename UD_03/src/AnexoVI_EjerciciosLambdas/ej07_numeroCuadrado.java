package AnexoVI_EjerciciosLambdas;

/*
 * Verificar si un numero es cuadrado perfecto
 */

import java.util.Scanner;

public class ej07_numeroCuadrado {

	static Scanner s = new Scanner(System.in);

	public static boolean cuadrado(int numero) {
		int raiz = (int) Math.sqrt(numero);
		if (raiz * raiz == numero) {
			return true;
		} else {
			return false;
		}
	}

	interface Verificador {
		boolean verificar(int raiz);
	}

	public static void main(String[] args) {
		System.out.println("Introduce el numero: ");
		int numero = s.nextInt();
		Verificador ver = (raiz) -> cuadrado(raiz);
		if (ver.verificar(numero)) {
			System.out.println("El numero " + numero + " es un cuadrado perfecto");
		} else {
			System.out.println("El numero " + numero + " no es un cuadrado perfecto");
		}

	}

}
