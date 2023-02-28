package class30;

import java.util.HashMap;
import java.util.Set;

public class MapDemo4 {
    public static void main(String[] args) {
        HashMap<String,Double> makeup=new HashMap<>();
        makeup.put("Lipstick",50.0);
        makeup.put("Foundation",40.0);
        makeup.put("Mascara",70.0);
        makeup.put("Eyeliner",12.0);
        makeup.put("Blush-on",55.0);
        System.out.println(makeup.keySet());
        //to get ALL the keys we can use KeySet method from Map interface
        Set<String> allKeys=makeup.keySet();
        System.out.println(allKeys);

        for(String s:allKeys){

            System.out.println(s);
        }
        //delete all the entries from the map for which the size of key is greater than 7

        allKeys.removeIf(x->x.length()>7);
        System.out.println(allKeys);
        System.out.println(makeup);

    }

}
