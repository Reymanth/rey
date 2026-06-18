import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;

/*
import java.util.HashSet;
import java.util.Set;

public class Day11 {
    public static void main(String[]args){
        Set<String>Set = new HashSet<>();
        Set.add("Madhu");
        Set.add("Madhu");
        Set.add("Pradhish");
        Set.add("Pradhish");
        Set.add("Reymanth");
        Set.add("Supriya");
        Set.add("Suthaa");

        for (String s : Set){
            System.out.println(s);
        }

    }

}

 */
public class Day11 {
    public static void main(String[]args){
        Map<String,Integer> person = new HashMap<>();
        person.put("Ram",89);
        person.put("John",78);
        person.put("Aravindh",67);
        person.put("Ramesh",90);
        System.out.println(person.get("percent"));
        person.entrySet().forEach(entry -> {
            System.out.println(entry.getKey()+":"+entry.getValue());

        });
    }
}