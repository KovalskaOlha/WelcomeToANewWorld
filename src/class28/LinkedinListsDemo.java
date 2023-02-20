package class28;

import java.util.LinkedList;

public class LinkedinListsDemo {
    public static void main(String[] args) {
        //LinkedList very similar to ArrayList
        LinkedList<String> names=new LinkedList<>();
        names.add("Artem");
        names.add("Elvira");
        names.add("Tamma");
        names.add("Temmus");
        names.add("Sam");
        System.out.println(names);

       for(String x:names){
           System.out.println(x);
       }

    }
}
