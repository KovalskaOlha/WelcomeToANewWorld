package class29;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class SetDemo5 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(30);
        System.out.println(numbers);
//first >>>>>>>>>>>>>>THE BEST ONE
        LinkedHashSet<Integer> nn=new LinkedHashSet<>(numbers);
        System.out.println(nn);
//second
        ArrayList<Integer> newNumbers=new ArrayList<>();
        for(Integer x:numbers){
            if(!newNumbers.contains(x)){
                newNumbers.add(x);
            }
        }
        System.out.println(newNumbers);
    }
}
