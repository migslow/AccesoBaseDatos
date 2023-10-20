package AnexoVI_EjerciciosLambdas;

/*
 * Restar dos números reales.
 */

import java.util.Scanner;

public class ej01_resta {

	static Scanner s = new Scanner(System.in);

	interface Resta {
		int resta(int a, int b);
	}

	public static void main(String[] args) {
		System.out.println("Introduce el primer numero: ");
		int n1 = s.nextInt();
		System.out.println("Introduce el segundo numero: ");
		int n2 = s.nextInt();
		Resta res = (a, b) -> a - b;
		int resultado = res.resta(n1, n2);
		System.out.println("El resultado es: " + resultado);

	}

}
