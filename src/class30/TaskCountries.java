package class30;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TaskCountries {
    public static void main(String[] args) {
        Map<String,String> countries=new TreeMap<>();
        countries.put("Italy","Rome");
        countries.put("Germany","Berlin");
        countries.put("Turkey","Ankara");
        countries.put("USA","Washington DC");
        countries.put("Portugal","Lisbon");
        //System.out.println(countries.keySet());
        //System.out.println(countries.values());

        //Set<Map.Entry<String,String>> entrySet=countries.entrySet();
           var entrySet=countries.entrySet();
        for (var entry:entrySet) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        var iterator=countries.entrySet().iterator();
        while(iterator.hasNext()){
            var entry=iterator.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }


    }
}
