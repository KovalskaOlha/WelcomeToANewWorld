package class28;

import java.util.ArrayList;

public class BoxingDemo {
    public static void main(String[] args) {
        //class
        Integer integer=new Integer(10);// called the constructor of the class
        int number=integer;// its auto unboxing
        int num2=integer.intValue(); // unboxing manually

        double d=12.3;//primitive
        Double wrapperD=new Double(d);// convert in datatype by calling the constructor BOXING
        Double wrap=12.5;
        //or
        Double w=d;//autoboxing

        Float f=12.3f;
        ArrayList<Double>arrl=new ArrayList<>();
        arrl.add(12.0);// float we can store in double only in primitives
//with classes it not works



    }
}
