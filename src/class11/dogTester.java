package class11;

import java.util.Scanner;

public class dogTester {
    public static void main(String[] args) {
        // creating an actual object from the class Scanner
        //Scanner scanner=new Scanner(System.in); example

        // this is how we create the objects of the class
        dog dog1=new dog();
        dog1.bark();
        dog1.sleep();
    }
}
