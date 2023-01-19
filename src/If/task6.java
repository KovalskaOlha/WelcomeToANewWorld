package If;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        //)Write a program to swap 2 numbers without a temporary variable?
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 2 numbers");

        int a= scan.nextInt();
        int b= scan.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println( a +" " +b);
    }
}
