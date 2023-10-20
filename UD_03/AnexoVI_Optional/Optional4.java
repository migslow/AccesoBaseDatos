/*
 Retrieve Default Value
- orElse() Method
The orElse() method returns the value if present, otherwise return other (default value).
 */
import java.util.Optional;

public class Optional4 {
    public static void main(String[] args) {

    	String email = "alberto@gmail.com";
        Optional<String> stringOptional = Optional.ofNullable(email);
        String defaultOptional = stringOptional.orElse("default@gmail.com");
        System.out.println(defaultOptional); //alberto@gmail.com
    	
    	
    	email = null;
        stringOptional = Optional.ofNullable(email);
        defaultOptional = stringOptional.orElse("default@gmail.com");
        System.out.println(defaultOptional); //default@gmail.com
    }
}