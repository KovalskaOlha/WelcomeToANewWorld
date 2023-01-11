package HomeWork2;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        /*Using scanner class create calculator.
        Allow user to enter 2 numbers and operator(+,-,*,/).
        Based on operator provide the result to user.
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers and operator +,-,*,/");
        int num1=sc.nextInt();
        char operator=sc.next().charAt(0);
        int num2=sc.nextInt();
         switch(operator){
             case '+':
                 System.out.println(num1+num2);
                 break;
             case'-':
                 System.out.println(num1-num2);
                 break;
             case'*':
                 System.out.println(num1*num2);
                 break;
             case'/':
                 System.out.println(num1/num2);
                 break;
         }


    }
}
