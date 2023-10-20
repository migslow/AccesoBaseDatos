package _01InterfacesFuncionalesyExpresionesLambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Orden5_1 {

	public static void main(String[] args) {
		List<Cliente> lista = Arrays.asList(new Cliente("333", "Luis"), 
											new Cliente("222", "Alberto"),
											new Cliente("666", "Belén"),
											new Cliente("111", "Clara"));
		//
		// Opción 1
		/*Comparator<Cliente> comp = (Cliente a, Cliente b) 
									-> {return a.getNombre().compareTo(b.getNombre());};
		*/
		
		// Opción 2
		Comparator<Cliente> comp = (a, b) -> {return a.getNombre().compareTo(b.getNombre());};
			
		
		Collections.sort(lista, comp);
		System.out.println(lista);
		
												
	}

}
