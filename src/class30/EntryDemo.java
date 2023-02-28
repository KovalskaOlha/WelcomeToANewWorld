package class30;

import java.util.LinkedHashSet;
import java.util.Set;

public class EntryDemo {
    public static void main(String[] args) {
        Set<Entry> enttySet=new LinkedHashSet<>();
        enttySet.add(new Entry(1,"Olga"));
        enttySet.add(new Entry(2,"Katy"));
        enttySet.add(new Entry(3,"Paul"));
        enttySet.add(new Entry(4,"Gulnaz"));
        enttySet.add(new Entry(5,"Saba"));
        enttySet.add(new Entry(6,"Tami"));
        enttySet.add(new Entry(7,"Dima"));

        //remove those obj from which value of key is greater than 2

        enttySet.removeIf(x->x.getKey()>2 && x.getValue().contains("i"));
        System.out.println(enttySet);
    }
}
