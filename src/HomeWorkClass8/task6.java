package HomeWorkClass8;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        /*Write a program to ask a user to enter 5 item they want to buy and the price of that item.
        Every time user enters money accumulate the amount and tell the user how much is left to pay off.
        If user give more money program should return a change.
        Whenever a user done with payments program should say "Thank you for shopping!"*/

        Scanner sc=new Scanner(System.in);
        double total=0;



        for (int i = 0; i < 3; i++) {

            System.out.println("Enter an item you want to buy and price of it");
            String item=sc.nextLine();
            double price=sc.nextDouble();
            total=total+price;
            System.out.println("This is the total amount "+total);
        }
        System.out.println("please pay for the items");
        double amount=sc.nextDouble();

        if(amount>total){
            double change= amount-total;
            System.out.println("Hey here is your change "+change);
        }else if(amount<total){
            System.out.println("you can't buy all the items");
        }
        System.out.println("thank you for shopping");








    }
}
