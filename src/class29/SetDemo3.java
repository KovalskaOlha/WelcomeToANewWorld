package class29;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo3 {
    public static void main(String[] args) {
        TreeSet<String> fruit=new TreeSet<>();
        fruit.add("Mango");
        fruit.add("Orange");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Apple");
        System.out.println(fruit);
    }
}
