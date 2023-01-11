package HomeWork;

import java.util.Scanner;

public class WorkedYears {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Hello! How many years have you worked?");
        int years= scan.nextInt();
        if(years>=5){
            System.out.println("You are eligible for bonus");
        }else{
            System.out.println("Sorry! You are not eligible for bonus!");
        }

        if(years>=5) {
            System.out.println("What is your annual salary?");
        }
        int salary= scan.nextInt();
        if(salary>50000){
            System.out.println("Your bonus is $5000");
        }else{
            System.out.println("Your bonus is $3000");
        }


        }
    }

