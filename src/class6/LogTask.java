package class6;

import java.util.Scanner;

public class LogTask {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Please, enter 3 numbers");
        int number= sc.nextInt();
        int number2= sc.nextInt();
        int number3=sc.nextInt();



        if(number>number2 && number2>number3){
            System.out.println(number+" is the largest number");
        }else if(number2>number && number2>number3){
            System.out.println(number2+ " is the largest number");
        }else if(number3>number2&&number3>number){
            System.out.println(number3+" is the largest number");
        }
    }
}
