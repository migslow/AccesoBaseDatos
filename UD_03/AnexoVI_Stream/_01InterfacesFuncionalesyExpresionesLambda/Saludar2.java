// Ampliación de la anterior para saludar a un grupo de personas

package _01InterfacesFuncionalesyExpresionesLambda;

import java.util.ArrayList;
import java.util.List;

public class Saludar2 {
	public static  <T> List<String> saludarGrupo (T[] grupo, Saludo<T> saludo){
		List<String> res = new ArrayList<>();
		for (T e : grupo) {
			res.add(saludo.saludar(e));
		}
		return res;
	}
	//
	
	public static void main(String[] args) {
		Cliente [] grupoClientes = {
				new Cliente("333", "Luis"), 
				new Cliente("222", "Alberto"),
				new Cliente("666", "Belén"),
				new Cliente("111", "Clara")};
	
	    System.out.println(saludarGrupo(grupoClientes, c->"¡Buenos días " + c.getNombre() + "!\n"));
	}

}


