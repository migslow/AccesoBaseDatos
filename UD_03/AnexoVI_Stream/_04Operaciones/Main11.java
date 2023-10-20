package _04Operaciones;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main11 {
	private static BookRepository bookRepository;
	private static List<Book> bookList;

	public static void main(String[] args) {

		bookRepository = new BookRepository();
		bookList = new ArrayList<Book>();
		bookList.addAll(bookRepository.getBooks());
		//

		Book book = bookList.stream()
				.max((book1, book2) -> { 
					return (book1.getPrice().compareTo(book2.getPrice()));
				})
				.orElse(null);
						
		System.out.println(book);
		System.out.println(book.getPrice()==50.99);

	}

}
