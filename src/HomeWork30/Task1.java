package HomeWork30;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        /*Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet.*/
        Map<Integer,String> bestBuyStore=new HashMap<>();
        bestBuyStore.put(12233344,"TV");
        bestBuyStore.put(123456,"A/C");
        bestBuyStore.put(2987654,"Oven");
        bestBuyStore.put(43456,"Radio");
        bestBuyStore.put(212121,"Phone");
        var entrySet=bestBuyStore.entrySet();
        for (var entry:entrySet) {
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }

    }
}
