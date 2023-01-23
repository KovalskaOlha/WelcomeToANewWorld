package class12;

import java.util.Scanner;

public class CredentialsCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Username");
        String userName=sc.nextLine();
        System.out.println("Password");
        String password=sc.nextLine();
        System.out.println("Confirm the password");
        String passConfirm=sc.nextLine();

        if(userName.isEmpty() || password.isEmpty()){
            System.out.println("username or pass can not be empty");
        }else if(password.length()<8){
            System.out.println("pass is too short");
        }else if(password.contains(userName)){
            System.out.println("pass can not contain username");

        }else if(! password.equals(passConfirm)){
            System.out.println("Password do not match");
        }else{
            System.out.println("Your username and pass is created");
        }
    }


}

