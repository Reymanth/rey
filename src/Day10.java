/*
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

 */


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Day10 {

static void process(LinkedList<String>list){
    System.out.println("REMOVED:"+list.removeFirst());
}


    static void main(){
        LinkedList<String> list= new LinkedList<>();
        list.add("Reymanth");
        list.add("Pradhish");
        list.add("Madhu");
        list.add("Supriya");
        list.add("Suthaa");
        list.add("Ram");


            while (list.size()>1){
           process(list);

        }
        System.out.println("~ Empty ~");

   }
   }