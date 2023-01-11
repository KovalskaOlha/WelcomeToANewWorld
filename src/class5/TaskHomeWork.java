package class5;

import java.util.Scanner;

public class TaskHomeWork {
    public static void main(String[] args) {

        int number1=10, number2=20, number3=30;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter 3 numbers");
        number1= sc.nextInt();
        number2= sc.nextInt();
        number3= sc.nextInt();




        if(number1>number2){
            if(number1>number3){
                System.out.println("number is the largest "+number1);
            }
        }
        if(number2>number1){
            if(number2>number3){
                System.out.println("number 2 is the largest "+number2);
            }
        }
        if(number3>number1){
            if(number3>number2){
                System.out.println("number 3 is the largest "+number3);
            }
        }
    }
}
