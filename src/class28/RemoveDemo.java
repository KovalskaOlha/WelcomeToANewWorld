package class28;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveDemo {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("Cat");
        words.add("Lava");
        words.add("Java");
        words.add("Computer");
//java 10
        var name="jbsjnq";
        var c='s';
        var f=12.5;

        //Iterator is an interface. If we want to remove or add smth
        //this is the longer way!

        /* java from 6 to java 19
        Iterator<String> iterator=words.iterator();
        while (iterator.hasNext()){
            String s= iterator.next();
            if(s.endsWith("a")){
                iterator.remove();
            }
        }*/
// java 8
        words.removeIf(s -> s.endsWith("a"));
        System.out.println(words);

    }
}
