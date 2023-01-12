package class7;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {
        boolean condition=true;
        Scanner sc=new Scanner(System.in);
        int i=15;
        while(condition){
            System.out.println("Please enter a number between 10 to 20");
            int userInput=sc.nextInt();
            if(userInput>i){
                System.out.println("your entered number is greater");
            }else if(userInput<i){
                System.out.println("you entered a smaller number");
            }else{
                System.out.println("You won!!");
                condition=false;
            }


        }
    }
}
