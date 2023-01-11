package If;

import java.util.Scanner;

public class PracticeAtHome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Do you need a loan?");
        boolean answer=sc.nextBoolean();
        if(answer){
            System.out.println("What is your credit score?");
        }else{
            System.out.println("Unknown");
        }
        int score=sc.nextInt();
        if(score<600){
            System.out.println("The eligibility is  Not eligible");
        }else if(score>=600 && score<=700){
            System.out.println("  The eligibility is Maybe eligible");
        }else if(score>=701 && score<=800){
            System.out.println("The eligibility is Eligible");
        }else if(score>800){
            System.out.println("The eligibility is Definitely eligible");
        }
        }



    }

