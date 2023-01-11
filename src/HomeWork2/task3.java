package HomeWork2;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your quiz score");
        int quiz=sc.nextInt();
        System.out.println("Enter your mid term score");
        int midTerm=sc.nextInt();
        System.out.println("Enter your final score");
        int finalScore=sc.nextInt();
        if(quiz+midTerm+finalScore>=90){
            System.out.println("grade=A");
        }else if(quiz+midTerm+finalScore>=70 &&quiz+midTerm+finalScore<90){
            System.out.println("grade=B");
        }else if(quiz+midTerm+finalScore>=50 &&quiz+midTerm+finalScore<70){
            System.out.println("grade=C");
        }else if(quiz+midTerm+finalScore<50){
            System.out.println("grade=F");
        }

    }
}
