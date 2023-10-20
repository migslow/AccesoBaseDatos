package _01InterfacesFuncionalesyExpresionesLambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Orden2 {

	public static void main(String[] args) {
		List<Cliente> lista = Arrays.asList(new Cliente("333", "Luis"), 
											new Cliente("222", "Alberto"),
											new Cliente("666", "Belén"),
											new Cliente("111", "Clara"));
		//
		Collections.sort(lista, new ComparaNombres());
		System.out.println(lista);
		
												
	}

}
