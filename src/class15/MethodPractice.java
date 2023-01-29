package class15;

import java.util.Scanner;

public class MethodPractice {
    // create a method which returns true or false and take the int number aas a
    //parameters  if number is even it returns true otherwise it reruns false

    boolean TrueOrFalse( int a){
        boolean flag;
        if( a %2==0){
            flag=true;
        }else {
            flag=false;
        }
        return flag;
    }

    boolean TrueOrFalse1( int a){
        if( a %2==0){
            return true;
        }else {
            return false;
        }

    }

    boolean TrueOrFalse2( int a){
        return a%2==0;
    }




}
