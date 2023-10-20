/*
 La función 'findFirst()' se utiliza para devolver el primer elemento encontrado del 'stream'. 
 Se suele utilizar en combinación con otras funciones cuando hay que seleccionar un único valor 
 del Stream que cumpla determinadas condiciones.

'findFirst()' devuelve un objeto de tipo 'Optional' para poder indicar un valor por defecto 
en caso de que no se pueda devolver ningún elemento del 'stream'.

En el ejemplo se filtran los libros por su precio, a continuación se muestran por consola 
los libros filtrados y finalmente se selecciona el primero que cumpla la condición.
En caso de que ningún libro cumpliese la condición del 'filter()' indicamos que se devuelva 
como valor 'null'.

Este es un buen ejemplo para observar una característica propia del funcionamiento de los 'streams', 
que es la 'LazyEvaluation'.
Las funciones del 'stream' se van ejecutando una tras otra por cada elemento (libro) y luego 
se pasa al siguiente elemento sobre el cual se vuelven a ejecutar todas las fuciones y 
así sucesivamente por cada elemento del stream.

En nuestro ejemplo hay 2 libros que cumplen la condición del 'filter()', pero si lo ejecutamos 
observamos que en el 'peek()' solo se muestra por consola el primero de ellos.
Esto es debido a que en cuanto el primer libro que cumple la condición del 'filter()' 
llega al 'findFirst()' el stream se finaliza devolviendo dicho elemento, con lo cual 
sobre el siguiente libro ya no se llega a ejecutar el correspondiente 'filter()' 
ni el resto de funciones del 'stream'.
 */
package _04Operaciones;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main07 {
	private static BookRepository bookRepository;
	private static List<Book> bookList;

	public static void main(String[] args) {

		bookRepository = new BookRepository();
		bookList = new ArrayList<Book>();
		bookList.addAll(bookRepository.getBooks());
		//
		Book bookFirst = bookList.stream()
				.filter(book -> book.getPrice() >= 15)
				.peek(System.out::println)
				.findFirst()
				.orElse(null);
	
	System.out.println(bookFirst.getPrice() >= 15);
	
	
	}

}
