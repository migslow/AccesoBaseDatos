/*
El método 'map()' recibe como parámetro una lambda de tipo 'Function' por lo que debemos 
indicar una función que recibe como parámetro de entrada cada elemento del stream y 
devuelve un objeto que puede ser un tipo de dato distinto o del mismo.

Se utiliza para modificar el contenido del stream a partir de un punto determinado del flujo.

En nuestro ejemplo el 'stream' comienza con un flujo de objetos de tipo 'Book' y a partir del 'map()' se convierte en un flujo de tipo 'String' al devolver el título de cada libro.
 
peek y map son métodos diferentes con sintaxis diferentes. El método peek() toma un Consumidor 
como argumento, mientras que map() toma una Función como argumento. 
Consumer solo consume el valor y no devuelve ningún resultado, mientras que Function acepta 
un argumento y produce un resultado.
 */
package _04Operaciones;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main03 {
	private static BookRepository bookRepository;
	private static List<Book> bookList;

	public static void main(String[] args) {

		bookRepository = new BookRepository();
		bookList = new ArrayList<Book>();
		bookList.addAll(bookRepository.getBooks());
		List<String> titles = bookList.stream()
				.map(book -> book.getTitle())
				.peek(title -> System.out.println(title))
				.collect(Collectors.toList());
		
		System.out.println(titles.size()== bookList.size()); // true
	}

}
