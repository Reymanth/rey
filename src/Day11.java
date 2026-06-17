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
