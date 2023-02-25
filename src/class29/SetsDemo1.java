package class29;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class SetsDemo1 {
    public static void main(String[] args) {
        //if we store the elements in List and then we want to change ArrayList in LinkedList we can
        //just rename  new LinkedList in ArrayList
        List<String> list=new LinkedList<>();
        list.add("Java");
        list.add("Tea");
        list.add("Coke");
        list.add("Coke");
        list.add("Milk");
        System.out.println(list);

        HashSet<String>fruit=new HashSet<>();
        //do not allow the duplicates and they don't care about the order
        //they use the special concepts hashFunctions
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Orange");
        System.out.println(fruit);

    }
}
