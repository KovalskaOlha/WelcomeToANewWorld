package HomeWork30;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    /*Create a collection of integers in which you can keep duplicates.
Write a logic to find sum of all integers*/

    public static void main(String[] args) {
        List<Integer> num=new ArrayList<>();
         num.add(10);
         num.add(20);
         num.add(20);
         num.add(10);
         num.add(5);
         num.add(5);
         int sum=0;
        for (Integer x :num) {
             sum+=x;
         }
        System.out.println("The sum is "+sum);

    }

}
