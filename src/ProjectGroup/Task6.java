package ProjectGroup;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
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
