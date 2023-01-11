package HomeWork;

import java.util.Scanner;

public class CreditCard {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Hi!Do you have a credit card? Print true or false!");
        boolean answer=input.nextBoolean();
        if(!answer){
            System.out.println("We can offer you a credit card");
        }else{
            System.out.println("What is balance on your card?");
        }
        double money= input.nextDouble();
        if (money>1000){
            System.out.println("You should pay off immediately!");
        }else{
            System.out.println("Good! You can spend more))");
        }




    }
}
