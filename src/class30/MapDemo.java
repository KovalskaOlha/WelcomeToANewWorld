package class30;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> studentsMap=new HashMap<>();
        studentsMap.put(1,"Nezir");
        studentsMap.put(2,"Anush");
        studentsMap.put(3,"Sam");
        studentsMap.put(4,"Aisha");

        System.out.println(studentsMap);
        System.out.println(studentsMap.get(3));
        System.out.println(studentsMap.size());
        System.out.println(studentsMap.containsKey(6));
        System.out.println(studentsMap.containsValue("Olga"));
        System.out.println(studentsMap.remove(1));
        System.out.println(studentsMap);
        studentsMap.replace(2,"Asli");
        System.out.println(studentsMap);


    }
}
