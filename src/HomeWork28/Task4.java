package HomeWork28;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        /*Create an arrayList of drinks.
        If any drink has letter āaā or āeā replace it with water.
         */

        ArrayList<String>drinks=new ArrayList<>();
        drinks.add("Soda");
        drinks.add("Wine");
        drinks.add("Coca-Cola");
        drinks.add("Kombucha");
        drinks.add("Champagne");

        for (int i = 0; i < drinks.size(); i++) {
            String drink= drinks.get(i);
            if(drink.contains("a") || drink.contains("e")){
                drinks.set(i,"Water");
            }
        }
        System.out.println(drinks);

        

    }
}
