package HomeWork2;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        /*Write a program to find largest number
        among three numbers using nested if provided by a user (numbers must be distinct) */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 distinct numbers");
        int num1= sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        if(num1>num2) {
            if (num1 > num3) {
                System.out.println("The largest number is " + num1);
            }
        }else if(num2>num3){
                System.out.println("the largest number is "+num2);
            }else{
                System.out.println("The largest number is "+num3);
            }
    }
}
