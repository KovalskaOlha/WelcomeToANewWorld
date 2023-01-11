package If;

import java.util.Scanner;

public class ScannerBonus {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Welcome!How many years have you worked?");
        int years= scan.nextInt();
        if(years<5){
            System.out.println("You are not eligible for bonus");
        }else{
        System.out.println("What is your annual salary?");
        int salary= scan.nextInt();
        if(years>5&&salary>50000){
            System.out.println("Your bonus is 1000");
        }
        if(years>5&&!(salary>50000)){
            System.out.println("Your bonus is 500");
        }

    }
}}
