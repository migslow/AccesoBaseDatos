package _02InterfacesFuncionalesDeLaApi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import _01InterfacesFuncionalesyExpresionesLambda.Cliente;

public class Ifa_01 {

	public static void main(String[] args) {
		Predicate<Integer> esPositivo = x-> x>0;
		// boolean test (T valor) es el método abstracto.
		System.out.println(esPositivo.test(5));  // true
		//También vale
			// Predicate<Integer> esPositivo2 = x-> {return (x>0);};
			// System.out.println(esPositivo.test(5));
		//----------------------------------------------
		// 1 Otros métodos de la interfaz Predicate
		Predicate<Integer> esNoPositivo = esPositivo.negate();
		System.out.println(esNoPositivo.test(5)); // false
		// O también sin tener que declarar la interfaz
		System.out.println(esPositivo.negate().test(5)); // false
		//También directamente
		Predicate<Integer> esNoPositivo2 = x-> x<=0;
		System.out.println(esNoPositivo2.test(5));// false
		//----------------------------------------------
		// 2 Otros métodos de la interfaz Predicate
		// Predicate<T> and (Predicate<? super T> otro)
		Predicate<Integer>esPar = n ->n%2==0;
		Predicate<Integer>esPositivoYPar = esPar.and(esPositivo);
		System.out.println(esPositivoYPar.test(6)); // true
		//También vale
		System.out.println(esPar.and(esPositivo).test(6)); // true
		//----------------------------------------------
		// 3 Otros métodos de la interfaz Predicate
		// Predicate<T> or (Predicate<? super T> otro)
		Predicate<Integer>esPositivoOPar = esPar.or(esPositivo);
		System.out.println(esPositivoOPar.test(-7)); // false
		//También vale
		System.out.println(esPar.or(esPositivo).test(-6)); // true
		//
		// -------------------------------------------------------
		// Function<T,V> y su método abstracto V apply(T x)
		// (tiene otras tres funciones por defecto que no se ven ahora)
		Function<Double, Double> cuadrado = x ->x*x;
		System.out.println(cuadrado.apply(2.0)); // 4.
		//
		// -------------------------------------------------------
		// Consumer<T> con su método abstracto void accept (T t)
		Consumer<Cliente> saludoClie = c -> System.out.println("Hola, "+ c.getNombre());
		Cliente clie = new Cliente("222", "Alberto Carrera");
		saludoClie.accept(clie); // Hola, Alberto Carrera
		//
		// Método forEach() de la interfaz Iterable<T>
		// default void forEach(Consumer<? super T> accion)
		// puede ser llamado por cualquier objeto que implemente Interable 
		// (p.ej. Colecciones ArrayList, LinkedList, HashSet, TreeSet...)
		List<Cliente> listaClientes =  new ArrayList<>();
				listaClientes.add (new Cliente("333", "Luis")); 
				listaClientes.add (new Cliente("222", "Alberto"));
				listaClientes.add (new Cliente("666", "Belén"));
				listaClientes.add (new Cliente("111", "Clara"));
		listaClientes.forEach(saludoClie); // Saluda a los 4
		
	}

}
