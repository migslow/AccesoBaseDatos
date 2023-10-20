// REFERENCIAS A MÉTODOS  ::
package _02InterfacesFuncionalesDeLaApi;


import java.util.function.Function;


public class Ifa_2 {

	public static void main(String[] args) {
		
		Function<Double, Double> raiz = x ->Math.sqrt(x);
		System.out.println(raiz.apply(64.0)); // 8
		// En su lugar podemos poner
		Function<Double, Double> raiz2 = Math::sqrt;
		System.out.println(raiz2.apply(36.0)); // 6
		//---------------------------------------------------
		Function<Integer, Integer> f1 = Calculos::cubo;
		System.out.println(f1.apply(3)); // 27
		
	} // del main 
 //
static class Calculos{
	Integer cuadrado (Integer a) {
		return a*a;
	}
	static Integer cubo (Integer a) {
		return a*a*a;
	}
}
	
} // de Ifa_2
