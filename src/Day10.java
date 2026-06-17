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

/*
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
 */


import java.util.LinkedList;

public class Day10 {

    static void process(LinkedList<String> list) {
        System.out.println("Removed : " + list.removeFirst());
    }

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();


        list.add("701 - Arjun - 95");
        list.add("702 - Varma - 98");
        list.add("703 - Reddy - 90");
        list.add("704 - Dhoni - 78");
        list.add("705 - Virat - 85");

        System.out.println("Student List:");
        System.out.println(list);


        list.add("706 - Maran - 92");
        System.out.println("After Adding:");
        System.out.println(list);


        process(list);

        System.out.println("After Removing:");
        System.out.println(list);


        list.set(2, "704 - Darun - 95");
        System.out.println("After Updating");
        System.out.println(list);
    }
}
