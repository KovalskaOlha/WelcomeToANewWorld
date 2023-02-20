package HomeWork28;

import java.util.ArrayList;

public class TAsk3 {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("Live");
        words.add("Love");
        words.add("Friendship");
        words.add("Destiny");
        words.add("Nature");
        words.add("Planet");
        System.out.println(words);
        words.removeIf(s -> s.endsWith("e"));
        System.out.println(words);



    }
}
