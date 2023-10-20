/*
filter() Method
If a value is present, and the value matches the given predicate, 
return an Optional describing the value, otherwise return an empty Optional.
 */

import java.util.Optional;

public class Optional7 {
    public static void main(String[] args) {

        // without Optional
        String result = "abc";
        if(result != null && result.contains("abc")){
            System.out.println(result); //abc
        }

        // with Optional
        Optional<String> optionalStr = Optional.of(result);
        optionalStr.filter(res -> res.contains("abc"))
                .ifPresent((res) -> System.out.println(res)); //abc
        
        //-----------------------------------------------------------------
        result="";
        optionalStr = Optional.of(result);
        optionalStr.filter(res -> res.contains("abc"))
                .ifPresent((res) -> System.out.println(res)); // No imprime nada
        
        //
        result=null;
        optionalStr = Optional.ofNullable(result); //optionalStr = Optional.of(result); dará error
        optionalStr.filter(res -> res.contains("abc"))
                .ifPresent((res) -> System.out.println(res)); // No imprime nada
        
        
    }
}
