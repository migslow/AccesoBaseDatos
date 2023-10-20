/*
 There are several ways of creating Optional objects.

- empty() Method
To create an empty Optional object, we simply need to use its empty() static method:
Optional<Object> emptyOptional = Optional.empty();

- of() Method
The of() static method returns an Optional with the specified present non-null value.
Optional<String> emailOptional = Optional.of("ramesh@gmail.com");

- ofNullable() Method
The ofNullable() static method returns an Optional describing the specified value, 
if non-null, otherwise returns an empty Optional.
Optional<String> stringOptional = Optional.ofNullable("ramesh@gmail.com");
*/


import java.util.Optional;

public class Optional1 {
    public static void main(String[] args) {

        String email = "ramesh@gmail.com";

        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional); //Optional.empty

        Optional<String> emailOptional = Optional.of(email);
        System.out.println(emailOptional); // Optional[ramesh@gmail.com]

        Optional<String> stringOptional = Optional.ofNullable(email);
        System.out.println(stringOptional);// Optional[ramesh@gmail.com]
        
        Optional<String> stringOptional2 = Optional.ofNullable(null);
        System.out.println(stringOptional2); //Optional.empty
    }
}