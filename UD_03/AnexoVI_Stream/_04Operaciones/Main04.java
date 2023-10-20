/*
 * Método forEach()' recorremos cada elemento del stream para realizar alguna acción con él. 
 * Recibe como parámetro una lambda de tipo 'Consumer'.
Si nos fijamos bien 'forEach()' es un método que no devuelve ningún valor.
A diferencia del resto de funciones vistas, 'forEach()' es una operación de terminación, es decir,
no se pueden seguir realizando operaciones encadenadas con el mismo stream.
Recorremos el stream de libros para modificar su precio y mostramos por consola su nuevo valor.
 */
package _04Operaciones;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main04 {
	private static BookRepository bookRepository;
	private static List<Book> bookList;

	public static void main(String[] args) {

		bookRepository = new BookRepository();
		bookList = new ArrayList<Book>();
		bookList.addAll(bookRepository.getBooks());
		//
		bookList.stream()
		.forEach(book -> {
			double newPrice = book.getPrice();
			newPrice *= 2;
			book.setPrice(newPrice);
			System.out.println(book);
		});
	}

}
