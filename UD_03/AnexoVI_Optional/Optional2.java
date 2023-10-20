/*
Get Value from Optional
- get() Method
The get() method returns a value if it is present in this Optional 
otherwise throws NoSuchElementException.
 */
import java.util.Optional;

public class Optional2 {
    public static void main(String[] args) {

        String email = "ramesh@gmail.com";
        Optional<String> stringOptional = Optional.ofNullable(email);
        String value = stringOptional.get();
        System.out.println(value); //ramesh@gmail.com
        //
        Optional<String> stringOptional2 = Optional.ofNullable(null);
        value = stringOptional2.get(); //Exception NoSuchElementException: No value present
    }
}