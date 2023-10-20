/*
 Checking Value Presence
- isPresent() Method
The isPresent() method returns true if there is a value present, otherwise false.
 */

import java.util.Optional;

public class Optional3 {
    public static void main(String[] args) {

        String email = "ramesh@gmail.com";
        Optional<String> stringOptional = Optional.ofNullable(email);
        if(stringOptional.isPresent()){
            System.out.println(stringOptional.get()); //ramesh@gmail.com
        }else{
            System.out.println("no value present");
        }
        //
        stringOptional = Optional.ofNullable(null);
        if(stringOptional.isPresent()){
            System.out.println(stringOptional.get()); 
        }else{
            System.out.println("no value present"); //no value present 
        }
        
    }
}
