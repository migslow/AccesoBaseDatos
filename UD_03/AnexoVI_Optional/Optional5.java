
/*
 orElseGet() Method
The orElseGet() method returns the value if present, 
otherwise invoke other and return the result of that invocation.
 */
import java.util.Optional;

public class Optional5 {
    public static void main(String[] args) {

        String email = null;
        Optional<String> stringOptional = Optional.ofNullable(email);
        String defaultOptional2 = stringOptional.orElseGet(() -> "alberto@gmail.com");
        System.out.println(defaultOptional2); //alberto@gmail.com
        //
        email = "mario@gmail.com";
        stringOptional = Optional.ofNullable(email);
        defaultOptional2 = stringOptional.orElseGet(() -> "alberto@gmail.com");
        System.out.println(defaultOptional2); //mario@gmail.com
    }
}