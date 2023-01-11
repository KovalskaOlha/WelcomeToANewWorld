package HomeWork;

public class Mortgage {
    public static void main(String[] args) {
        double rate=4.5;
        int price=200000;
        int loan=190000;
        if(rate>4.5){
            System.out.println("User will not buy a house");
        }else{
            System.out.println("User will buy a house");
        }
        if(price>200000){
            System.out.println("User will take a loan");
        }else{
            System.out.println("User will pay cash");
        }
        if (loan<=200000){
            System.out.println("Bank would lend the money");

        }else {
            System.out.println("Bank would reject the user");
        }
    }
}
