package HomeWorkClass8;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        //Create a program that will be asking user to apply for a credit card 10 times.
        // As soon you get an “yes” from a user program should stop asking.


        Scanner sc=new Scanner(System.in);
        System.out.println("Do you need a credit card? ");
       while(sc.next().equalsIgnoreCase("no")){
           System.out.println("Do you need a credit card?");
       }


        for (int i = 0; i < 10; i++) {
            System.out.println("Do you want a credit card?");
            String userInput=sc.next();
            if(userInput.equalsIgnoreCase("yes")){
                break;
            }

        }
    }



}