package HomeWork;

import java.util.Scanner;

public class DmvScanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to DMV! How old are you?");
        int age= scanner.nextInt();
        if(age>=18){
            System.out.println("We will issue a drive licence");
        }else{
            System.out.println("We will offer you to get a learners permit!");
        }
    }
}
