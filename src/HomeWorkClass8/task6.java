package HomeWorkClass8;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        /*Write a program to ask a user to enter item they want to buy and the price of that item.
        Every time user enters money accumulate the amount and tell the user how much is left to pay off.
        If user give more money program should return a change.
        Whenever a user done with payments program should say "Thank you for shopping!"*/

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an item you want to buy");
        String item=sc.nextLine();
        System.out.println("What is the price of it?");
        int price=sc.nextInt();//35
        System.out.println("Enter money");
        int money=sc.nextInt();
        if(money>price){
            System.out.println("Your change is "+(money-price));
        }else if(money<price){
            System.out.println((price-money)+" is left to pay");
        }else if(money==price){
            System.out.println("Thank you for shopping");
        }



    }
}
