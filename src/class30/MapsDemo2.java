package class30;

import java.util.HashMap;

public class MapsDemo2 {
    public static void main(String[] args) {
        HashMap<String,Double> fruit=new HashMap<>();
        fruit.put("Apple",1.99);
        fruit.put("Orange",2.99);
        fruit.put("Banana",4.99);
        fruit.put("Kiwi",0.99);
        fruit.put("Apple",3.99);//behind the scene the keys is stored in Set so we can not have duplicates
        fruit.put(null,null);
        System.out.println(fruit);


        HashMap<String,Double> makeup=new HashMap<>();
        makeup.put("Lipstick",50.0);
        makeup.put("Foundation",40.0);
        makeup.put("Mascara",70.0);
        makeup.put("Eyeliner",12.0);
        makeup.put("Blushon",55.0);

        HashMap<String,Double> groceries=new HashMap<>();
        groceries.putAll(fruit);
        groceries.putAll(makeup);
        System.out.println(groceries);



    }
}
