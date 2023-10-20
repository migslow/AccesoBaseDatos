/*
Con 'min()' se obtiene el elemento del 'stream' con el valor mínimo calculado a partir de 
la lambda de tipo 'Comparator' que indiquemos como parámetro.

'min()' devuelve un objeto de tipo 'Optional' para poder indicar un valor por defecto en caso 
de que no se pueda devolver ningún elemento del 'stream'.
 */
package _04Operaciones;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main10 {
	private static BookRepository bookRepository;
	private static List<Book> bookList;

	public static void main(String[] args) {

		bookRepository = new BookRepository();
		bookList = new ArrayList<Book>();
		bookList.addAll(bookRepository.getBooks());
		//

		Book book = bookList.stream()
				.min((book1, book2) ->  book1.getPrice().compareTo(book2.getPrice()))
				.orElse(null);
						
		System.out.println(book);
		System.out.println(book.getPrice()== 10); //true

	}

}
