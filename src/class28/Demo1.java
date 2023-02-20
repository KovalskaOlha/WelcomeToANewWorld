package class28;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        //Collections Framework
        // dynamic in nature
        ArrayList<String> words=new ArrayList<>();
        words.add("Cat");

        words.add("Computer");
        words.add("Java");
        words.add("Lava");

//remove the elements from this which ends a
        // we will have an error because this loop will change the dynemic data structure
        //we can not use normal for loop to perform any operation in Array that can modify the size
       /* for (String s:words) {
            if (s.endsWith("a")) {
                words.remove(s);
            }
        }*/
//using the loop is not a safe if we want to change the size
        for (int i = 0; i < words.size(); i++) {
            if(words.get(i).endsWith("a")){
                words.remove(i);

            }//in works not every time, depending on the data
        }
        System.out.println(words);
        }
}
