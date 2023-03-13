package homeWork33;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.SortedMap;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        try{
            System.out.println("Enter your age");
            int age=scanner.nextInt();
            System.out.println("Your age is "+age);
        }catch (InputMismatchException e){
            System.out.println("Invalid input");

        }

        scanner.close();
    }
}
