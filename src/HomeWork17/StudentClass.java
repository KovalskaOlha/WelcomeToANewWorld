package HomeWork17;

import java.util.SortedMap;

public class StudentClass {

    /*Write a Student class   that have instance variables name and address.
    Create a constructor that will initialize those variables.
    Print name & address of given  student using displayInfo method.*/

    String name;
    String address;

    StudentClass(String na, String ad){
        name=na;
        address=ad;
    }
    void displayInfo(){
        System.out.println("Name is "+name+" and address is "+address);
    }
}
