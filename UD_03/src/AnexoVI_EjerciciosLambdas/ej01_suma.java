package AnexoVI_EjerciciosLambdas;

/*
 * Sumar dos números reales.
 */

public class ej01_suma {

	interface Sumador {
		int sumar(int a, int b);
	}

	public static void main(String[] args) {
		Sumador sumador = (a, b) -> a + b;
		int resultado = sumador.sumar(5, 10);
		System.out.println(resultado);
	}

}
