package class28;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class GenericArrayList {
    public static void main(String[] args) {

       // ArrayList <String> name=new ArrayList<>(); NOW we have this
        //in 2004 used


        Object a=new String("some value");
        Object b=new Integer(10);
        Object c=new Scanner(System.in);


        //everything you can store in Object
        //every class is a child class of Object class
//NO ONE NOW USE THE ARRAYS LIKE THIS
       ArrayList name= new ArrayList(); //EARLIER version before Java5
        name.add("Zafar");
        name.add(10);
        name.add('a');

        for(Object j:name){ //Object is grandfather of all classes in Java
            ((String)j).trim(); //very hard to write code
        }
    }
}
