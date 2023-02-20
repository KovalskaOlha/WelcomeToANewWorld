package HomeWork28;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Victoria");
        names.add("Emma");
        names.add("Jerry");
        names.add("MelanyB");
        names.add("MelanyC");
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Britney"));
        System.out.println(names.size());
        System.out.println(names);
        //or
        for(String x:names){
            System.out.println(x);
        }
    }
}
