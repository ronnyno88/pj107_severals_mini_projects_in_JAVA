import java.util.HashMap;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class HashMap_Test {
    HashMap<Character, Integer> hashmap_text = new HashMap<>();
    String test = "Hello World";

    public void operate_in_HashMap(){
        for(char c:test.toCharArray()){
            if (hashmap_text.containsKey(c)) {
                hashmap_text.put(c, hashmap_text.get(c)+1);
            } else {
                hashmap_text.put(c, 1);
            }
        }
        String collect = hashmap_text.entrySet().stream()
        .filter(Predicate.not(entry -> entry.getKey()
        .equals("")))
        .map(entry -> entry.getKey() + ": "+ entry.getValue())
        .collect(Collectors.joining(","));

        System.out.println(collect);
    }
}
