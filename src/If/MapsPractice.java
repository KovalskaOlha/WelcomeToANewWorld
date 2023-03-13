package If;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class MapsPractice {
    public static void main(String[] args) {
//        HashMap<String,String>map=new HashMap<>();
//        map.put("Street","Patrick ST");
//        map.put("Suite","265");
//        map.put("City","Vienna");
//        map.put("Zip","22180");
//        map.put("Country","United State");
//        var iterator=map.entrySet().iterator();
//        while(iterator.hasNext()){
//            var entry=iterator.next();
//            System.out.println(entry.getValue().toUpperCase());
//        }
//        HashMap<String,String>map=new HashMap<>();
//        map.put("ONE","AAA");
//        map.put("TWO","BBB");
//        map.put("THREE","CCC");
//        map.put("FOUR","DDD");
//        map.put("FIVE","EEE");
//        var entrySet=map.entrySet();
//        for (var entry:entrySet) {
//            System.out.println(entry.getKey()+" : "+entry.getValue());
//        }
//        map.remove("ONE");
//        map.remove("FOUR");
//        for (var entry:entrySet) {
//            System.out.println(entry.getKey()+" : "+entry.getValue());
//        }
        HashMap<String,String>map=new HashMap<>();
        map.put("ONE","AAA");
        map.put("TWO","BBB");
        map.put("THREE","CCC");
        map.put("FOUR","DDD");
        map.put("FIVE","EEE");
        System.out.println("HashMap Before Replace :");
        var iterator=map.entrySet().iterator();
        while(iterator.hasNext()){
            var entry=iterator.next();
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        map.replace("THREE","ASEL");
        map.replace("FIVE","SUMAIR");
        System.out.println("------------------");
        System.out.println("HashMap After Replace :");
var iterator2=map.entrySet().iterator();
        while(iterator2.hasNext()){
            var entry=iterator2.next();
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

    }
}
