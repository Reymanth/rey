
import java.util.ArrayList;

        public class Day10 {
            static void main(){
                String[] student = {"Reymanth", "Pradhish", "Madhu", "Supriya", "Suthaa", "Ram"};
                System.out.println(student.length);
                ArrayList<String> name = new ArrayList();
                name.add("Reymanth");
                name.add("Pradhish");
                name.add("Madhu");
                name.add("Supriya");
                name.add("Suthaa");
                name.add("Ram");
                name.remove("Ram");
                for (String s : name) {
                    System.out.println(s);


                }
            }
        }
