package class29;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Double> number=new ArrayList<>();
        number.add(10.0);
        number.add(15.2);
        number.add(20.0);
        number.add(30.5);
        number.add(40.5);
        number.add(10.3);

        //remove action not able to use with loops because we can chance the size during the loops

       // number.removeIf(numb -> numb > 11);//lambda
       // System.out.println(number);

        //iterators
        Iterator<Double> iterator =number.iterator();
       /* System.out.println(iterator.hasNext());//true

        System.out.println( iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println( iterator.next());
        System.out.println(iterator.hasNext());*/
         /*true
           10.0
           true
           15.2
           false*/


        while(iterator.hasNext()){
            double num=iterator.next();
            if(num>11){
                iterator.remove();
            }
        }
        System.out.println(number);


    }
}
