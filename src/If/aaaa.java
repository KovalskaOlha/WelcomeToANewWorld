package If;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class aaaa {
    public static void main(String[] args){
        ArrayList<Integer> numbers=new ArrayList<>();
        for (int i = 50; i <=100; i++) {
            numbers.add(i);
        }
        numbers.removeIf(n->n %3!=0);
        System.out.println(numbers);





}


}
