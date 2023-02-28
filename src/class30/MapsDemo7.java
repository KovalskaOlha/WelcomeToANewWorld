package class30;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapsDemo7 {
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

        Set<Entry<Integer,String>> entrySet=studentsMap.entrySet();
        for (Entry <Integer,String> entry:entrySet) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        entrySet.removeIf(x->x.getKey()>2 && x.getValue().contains("i"));
        System.out.println(studentsMap);
    }
}
