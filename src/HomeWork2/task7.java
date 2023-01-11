package HomeWork2;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        /*Ask user to enter their country and capture it.
        Once values are captured print which language user speaks. */

        Scanner sc=new Scanner(System.in);
        System.out.println("Where are you from?");
        String country=sc.nextLine();
        switch(country){
            case"USA":
                System.out.println("You speak English");
                break;
            case"France":
                System.out.println("You speak French");
                break;
            case"Ukraine":
                System.out.println("You speak Ukrainian");
                break;
            case"Germany":
                System.out.println("You speak German");
                break;
            case"Greece":
                System.out.println("You speak Greek");
                break;

    }
}}
