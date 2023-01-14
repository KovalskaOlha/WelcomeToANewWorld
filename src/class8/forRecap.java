package class8;

import java.util.Scanner;

public class forRecap {
    public static void main(String[] args) {
        // 10 8 6 4 2
        for (int i = 10; i >0 ; i-=2) {
            System.out.println(i);

        }
        //REPLIT 63
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int input=sc.nextInt();
        for (int i = 0; i <=input; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
