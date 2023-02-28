package class30;

import java.util.Map;
import java.util.TreeMap;

public class TaskCountries2 {
    public static void main(String[] args) {
        Map<String,String> countries=new TreeMap<>();
        countries.put("Italy","Rome");
        countries.put("Germany","Berlin");
        countries.put("Turkey","Ankara");
        countries.put("USA","Washington DC");
        countries.put("Portugal","Lisbon");
       var values=countries.values();
       for(var value:values){
           System.out.println(value);
       }
       var iterator=countries.values().iterator();
       while(iterator.hasNext()){
           var value=iterator.next();
           System.out.println(value);
       }
    }
}
