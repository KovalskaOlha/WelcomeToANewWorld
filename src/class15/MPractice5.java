package class15;

import java.util.Scanner;

public class MPractice5 {
    /*create a method that does not take any parameters and returns
    * a String "Syntax"*/

    String printSchool(){
        return "Syntax";
    }

    /*Create a method createEmail().
    Based on values of users name, lastName and email type,
     your method should return complete email Address.
    Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com*/

    String email(String name,String lastname,String email){
        return name+lastname+"@"+email+".com";
    }

    public static void main(String[] args) {
        MPractice5 mp=new MPractice5();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.nextLine();
        System.out.println("Enter your lastname");
        String lastname=sc.nextLine();
        System.out.println("Enter email type");
        String mail=sc.nextLine();
        System.out.println(mp.email(name, lastname,mail).toLowerCase());

    }
}
