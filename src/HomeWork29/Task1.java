package HomeWork29;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Task1 {
    /*List<String> aList=new ArrayList<>();
aList.add("John");
aList.add("Jane");
aList.add("James");
aList.add("Jasmine");
aList.add("Jane");
aList.add("James");
How can you remove all duplicates from ArrayList?*/
    public static void main(String[] args) {
        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        HashSet<String> hList=new HashSet<>(aList);
        System.out.println(hList);
    }
}
