package HomeWorkClass8;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        //Write a program that reads a range of integers (start and end point),
        // provided by a user and then from that range prints the sum of the even and odd integers.

        Scanner sc=new Scanner(System.in);
        System.out.println("Please, enter 2 numbers starting point and ending point");
        int start=sc.nextInt();
        int end=sc.nextInt();
        int evenSum=0;
        int oddSum=0;

        for (int i = start; i <end ; i++) {
            if(i%2==0){
               evenSum+=i;
            }else{
               oddSum=oddSum+i;
            }

        }
        System.out.println("sum of even numbers "+evenSum);
        System.out.println("sum of odd numbers "+oddSum);

}
}
