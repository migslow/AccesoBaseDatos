// orElseThrow() Method
import java.util.Optional;

public class Optional6 {
    public static void main(String[] args) {

    	String email = "ramesh@gmail.com";
        Optional<String> stringOptional = Optional.ofNullable(email);
        String optionalObject = stringOptional.orElseThrow(() -> new IllegalArgumentException("Email inexistente"));
        System.out.println(optionalObject); //ramesh@gmail.com
        //
    	email = null;
        stringOptional = Optional.ofNullable(email);
        optionalObject = stringOptional.orElseThrow(() -> new IllegalArgumentException("Email inexistente"));  //<--
        System.out.println(optionalObject); // Error en la línea anterior
        
       //
        
        
    }
}
