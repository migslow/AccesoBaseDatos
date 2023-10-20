package _01InterfacesFuncionalesyExpresionesLambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Orden3 {
	// Con clase anónima
	public static void main(String[] args) {
		List<Cliente> lista = Arrays.asList(new Cliente("333", "Luis"), 
											new Cliente("222", "Alberto"),
											new Cliente("666", "Belén"),
											new Cliente("111", "Clara"));
		//
		Comparator<Cliente> comp = new Comparator<Cliente>(){
			public int compare(Cliente c1, Cliente c2) {
				return c1.getNombre().compareTo(c2.getNombre());
			}
		};
		Collections.sort(lista, comp);
		System.out.println(lista);
		
												
	}

}
