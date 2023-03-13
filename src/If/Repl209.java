package If;

import java.util.*;

public class Repl209 {
    public static void main(String[] args) {
        List<Map<String,Object>> datalist=new ArrayList<>();

        Map<String,Object> appleMap=new HashMap<>();
        appleMap.put("Items","Apple");
        appleMap.put("Price",20.00);
        appleMap.put("Quantity",10.0);
        datalist.add(appleMap);

        Map<String,Object> orangeMap=new HashMap<>();
        orangeMap.put("Items","Orange");
        orangeMap.put("Price",21.99);
        orangeMap.put("Quantity",10.0);
        datalist.add(orangeMap);

        for (Map<String,Object> map : datalist) {
            String items = (String) map.get("Items");
            double price = (Double) map.get("Price");
            double quantity = (Double) map.get("Quantity");
            double subtotal = price * quantity;
            System.out.println("Items: " + items + " Price: " + price + " Quantity: " + quantity + " Subtotal: " + subtotal);
        }
            double totalPurchase = 0;
            for (Map<String,Object> map : datalist) {
                double price = (Double) map.get("Price");
                double quantity = (Double) map.get("Quantity");
                double subtotal = price * quantity;
                totalPurchase += subtotal;
            }
        System.out.println("Your Purchase total :"+totalPurchase);
        }
}


