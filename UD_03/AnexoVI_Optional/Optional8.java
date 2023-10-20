/*
 map() Method
If a value is present, apply the provided mapping function to it, 
and if the result is non-null, return an Optional describing the result.
 */

import java.util.Optional;

public class Optional8 {
	public static void main(String[] args) {

		String result = " abc ";
		if (result != null && result.contains("abc")) {
			System.out.println(result); // abc
		}
		//
		Optional<String> optionalStr = Optional.of(result);
		optionalStr.filter(res -> res.contains("abc"))
					.map(String::trim) // Utilizando referencias a métodos
					.ifPresent((res) -> System.out.println(res)); // abc	
	}
}