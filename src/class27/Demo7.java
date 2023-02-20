package class27;

import java.util.ArrayList;

public class Demo7 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Fizzy");
        names.add("Savo");
        names.add("Sam");
        names.add("Urwa");
        names.add("Tarik");
        names.add("Abeera");
        System.out.println(names.contains("Daria"));
        System.out.println(names);
        names.remove("Sam");// indexes is changed inside an array
        System.out.println(names);

        names.set(3, "James Bond");// replace Tarik to JAmes Bond
        System.out.println(names);

        System.out.println(names.indexOf("Savo"));

    }
}
