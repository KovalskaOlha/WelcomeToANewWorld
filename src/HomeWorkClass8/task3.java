package HomeWorkClass8;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        //Write a program that reads a range of integers (start and end point),
        // provided by a user and then from that range prints the sum of the even and odd integers.

        Scanner sc=new Scanner(System.in);
        int evensum = 0 ;
        int oddsum = 0 ;
        System.out.println("Enter the number:");

        for(int i= sc.nextInt(); i>0; i=sc.nextInt()) {

            if(i % 2 == 0) {
                evensum+=i ;
            }
            else {
                oddsum+=i ;
            }

            System.out.println("Sum of even number is :"+evensum);
            System.out.println("Sum of odd number is :"+oddsum);



        }
}}
