package HomeWork2;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        /*Allow user to enter grade and then provide
        explanation: A-Excellent,
        B-Good,
         C-Average,
         D-Bad, any other grade --> Not Acceptable.
         At the end your program should print which grade was entered by a user with explanation.*/
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your grade");
        char grade=sc.next().charAt(0);
        switch (grade){
            case'A':
                System.out.println("Your grade is A-Excellent!");
                break;
            case'B':
                System.out.println("Your grade is B-Good");
                break;
            case'C':
                System.out.println("Your grade is C-Average");
                break;
            case'D':
                System.out.println("Your grade is D-Bad");
                break;
            default:
                System.out.println("Not Acceptable");
        }
    }
}
