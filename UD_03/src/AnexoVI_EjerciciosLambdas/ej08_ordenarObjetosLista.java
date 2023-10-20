package AnexoVI_EjerciciosLambdas;

/*
 * Ordenar obejtos de una lista
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ej08_ordenarObjetosLista {

	public static void main(String[] args) {
		ArrayList<Persona> personas = new ArrayList<Persona>();
		personas.add(new Persona("Juan", 30));
		personas.add(new Persona("Pedro", 25));
		personas.add(new Persona("Maria", 40));
		Collections.sort(personas, new PersonaComparator());
		personas.forEach((persona) -> {
			System.out.println(persona);
		});
	}

}
