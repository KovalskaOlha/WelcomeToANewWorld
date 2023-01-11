package class4;

import java.util.Scanner;

public class ScannerDemo2 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age=input.nextInt();
        System.out.println("You are "+age+" years old");
        System.out.println("Are you ready for holiday?");
        boolean ready=input.nextBoolean();
        System.out.println("We are ready for a holiday"+ready);

    }
}
