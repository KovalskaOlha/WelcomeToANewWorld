package HomeWork30;

import java.util.LinkedHashSet;

public class Task4 {
    /*Create the collection that will store single uniques
    Objects of a String type in which order is preserved.
    Write a logic to concatenate all string from the collection.
*/
    public static void main(String[] args) {
        LinkedHashSet<String> collection=new LinkedHashSet<>();
        collection.add("I");
        collection.add("am");
        collection.add("so");
        collection.add("glad");
        collection.add("to");
        collection.add("be");
        collection.add("here");

        for (String x:collection) {
            System.out.print(x+" ");
        }


    }
}
