package HomeWork29;

import java.util.LinkedHashSet;

public class Task2 {
    /*Create a Set of cities in which you want
    to make sure that insertion order is maintained.
     Then remove any city that starts with “A”;*/

    public static void main(String[] args) {
        LinkedHashSet<String> cities=new LinkedHashSet<>();
        cities.add("Ankara");
        cities.add("Miami");
        cities.add("New York");
        cities.add("Barcelona");
        cities.add("Kyiv");
        cities.add("Lisbon");
        System.out.println(cities);
        cities.removeIf(x->x.startsWith("A"));
        System.out.println(cities);
    }
}
