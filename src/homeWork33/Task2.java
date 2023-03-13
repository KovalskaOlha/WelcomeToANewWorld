package homeWork33;

import java.util.ArrayList;
import java.util.List;

import static homeWork33.Task2.listOfExections;

public class Task2 {
    /*Create a static method that will return a List of Exceptions.
      Inside your method create objects of 4 exception classes using
      try and catch blocks and store them inside your list.
      Call your method inside main and print name and details of all Exception objects.*/
   public static List listOfExections(){
        List <Exception> exceptions=new ArrayList<>();
        try{
            String str=null;
            System.out.println(str.charAt(2));
        }catch(NullPointerException ne){
            exceptions.add(ne);

        }

        try{
            System.out.println(10/0);
        }catch (ArithmeticException ae){
            exceptions.add(ae);

        }

        try{
            int [] a=new int[4];
            a[5]=1;
        }catch (ArrayIndexOutOfBoundsException aie){
            exceptions.add(aie);

        }

        try {
            String a="Happy to see you all";
            char c=a.charAt(20);
            System.out.println(c);
        }catch (StringIndexOutOfBoundsException se){
            exceptions.add(se);

        }
        return exceptions;
    }

}
class ExeptionTest{
    public static void main(String[] args) {
        List <Exception> exceptions= listOfExections();
        for(Exception ex:exceptions){
            System.out.println(ex.getClass()+" : "+ex.getMessage());
        }
    }
}
