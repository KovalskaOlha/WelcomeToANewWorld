package class30;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapsDemo6 {
    public static void main(String[] args) {
        Map<Integer,String> studentsMap=new HashMap<>();
        studentsMap.put(1,"Nezir");
        studentsMap.put(2,"Anush");
        studentsMap.put(3,"Sam");
        studentsMap.put(4,"Aisha");
        studentsMap.put(5,"Jimmy");
        studentsMap.put(6,"Paul");
        studentsMap.put(7,"Kim");
        studentsMap.put(8,"Jay");
        //System.out.println(studentsMap.values());

        //remove the key we use keySet()
        //remove the values we go wth the collection

        Collection<String> values=studentsMap.values();
        System.out.println(values);
        //remove all values which contain the letter i

        values.removeIf(x->x.contains("i"));
        System.out.println(values);
        System.out.println(studentsMap);
        //remove the entries if key is greater than 2 and value contains the letter "i





    }
}
