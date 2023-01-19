package ProjectGroup;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        int [] arr=new int[5];
        arr[0]=scan.nextInt();
        arr[1]=scan.nextInt();
        arr[2]=scan.nextInt();
        arr[3]=scan.nextInt();
        arr[4]=scan.nextInt();

        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];


        }
        System.out.println(sum);
    }
}
