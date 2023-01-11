package class6;

import java.util.Scanner;

public class LoopsScanner {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int i=1;
        int sum=0;
        while(i<=5){
            sum=sum+i;//1+2+3+4+5=15
            i++;

        }
        System.out.println(sum);


    }
}
