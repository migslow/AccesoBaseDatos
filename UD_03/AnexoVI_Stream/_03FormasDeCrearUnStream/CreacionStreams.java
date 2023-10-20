package _03FormasDeCrearUnStream;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class CreacionStreams {

	public static <T> void imprimirStream(Stream<T> st) {
		st.forEach(System.out::println);
	}
	
	
	public static void main(String[] args) throws IOException {
		// Empty Stream
		Stream<String> streamEmpty = Stream.empty();
		//imprimirStream(streamEmpty); // No imprime nada
		//
		//Stream.builder()
		Stream streamBuilder = Stream.builder().add("a").add("b").add("c").build();
		//
		// Stream de una Colección (Collection)
		List<String> lista = Arrays.asList("a", "b", "c");
		Stream<String> streamDeLista = lista.stream();
		//
		// Stream de Array
		String[] arr = new String[]{"a", "b", "c"};
		Stream<String> streamDeArrayFull = Arrays.stream(arr);
		Stream<String> streamDeArrayFull2= Stream.of(arr); // También vale esta 2ª forma
		//
		// Stream.generate()
		Stream<String> streamGenerated = Stream.generate(() -> "valor").limit(10);
		//
		//Stream.iterate()
		Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(5);
		//
		//Stream de Primitivos
		IntStream intStream = IntStream.range(1, 3);
		LongStream longStream = LongStream.rangeClosed(1, 3);
		// longStream.forEach(System.out::println);
		//
		//Stream de String
		IntStream streamDeChars = "abc".chars();
		//streamDeChars.forEach(System.out::println); //97 98 99. No existe CharStream
		//
		// Stream de File
		Path path = Paths.get("Ficheros\\fichero.txt");
		// Stream de File forma 1
		Stream<String> streamDeStrings = Files.lines(path);
		// Stream de File forma 2
		Stream<String> streamConCharset = Files.lines(path, Charset.forName("UTF-8"));
		imprimirStream(streamConCharset);
	}

}
