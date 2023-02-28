package class30;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo5 {
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
        //remove all keys from map that are greater than 2
        //first way
        studentsMap.keySet().removeIf(x->x>2);
        System.out.println(studentsMap);
        //second way

      Set<Integer> newOne=studentsMap.keySet();// we can use Set and as well the Collection
       newOne.removeIf(x->x>2);
        System.out.println(newOne);

    }
}
