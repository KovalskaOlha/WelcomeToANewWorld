package HomeWork30;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    /*Create a Map that will store Employee name and salary.
     Write a logic to retrieve an employee who gets the highest salary.
     Output should be in the below format
      John Smith=$100000*/
    public static void main(String[] args) {
        Map<String,Integer> employee=new HashMap<>();
        employee.put("John Smith",50000);
        employee.put("Katy Perry",90000);
        employee.put("Tom Garcia",400000);
        employee.put("Kim Levinskiy",65000);
        employee.put("Samantha Jones",121000);


        var emp=employee.entrySet();
        int bigS=0;
        String rich="";
        for (var x :emp) {
            if (x.getValue() > bigS) {
                bigS = x.getValue();
                rich = x.getKey();
            }
        }
        System.out.println(rich+"=$"+bigS);
    }
}
