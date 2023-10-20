/*
El método 'peek()' recibe como parámetro una lambda de tipo 'Consumer' para poder utilizar 
y/o modificar cada elemento del stream. Normalmente se utiliza para mostrar por consola 
el contenido del stream en cada momento.
 */
package _04Operaciones;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main02 {
	private static BookRepository bookRepository;
	private static List<Book> bookList;

	public static void main(String[] args) {

		bookRepository = new BookRepository();
		bookList = new ArrayList<Book>();
		bookList.addAll(bookRepository.getBooks());
		//
		
		List<Book> books = bookList.stream()
				.peek(book -> book.setAuthor("Desconocido"))
				.peek(book -> System.out.println(book))
				.collect(Collectors.toList());
	}

}
