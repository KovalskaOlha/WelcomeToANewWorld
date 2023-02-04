package class19;

public class Test {
    public static void main(String[] args) {
       BankAccount ba= new BankAccount();
       ba.accountNumber=734678937l;
       ba.money=1000;
       ba.deposit();

        System.out.println(ba.accountNumber);
        System.out.println(ba.money);

        System.out.println("_________Creating an object of checking account______");

       Checking check= new Checking();
       //features from parent
       check.accountNumber=7686554l;
       check.money=780;
       //feature from checking class
       check.interest=0;

       check.deposit(); //from parent
       check.transfer();// from child

        System.out.println("____Creating an Object of Savings account____");

        Savings save=new Savings();
        save.accountNumber=86566798l;
        save.money=7656;
        save.profit=100;
        //save.interest=0; we can inherited just from parent class
        save.deposit();// from parent
        save.takeProfit();// come from savings

        SuperSavings ss=new SuperSavings();
        ss.accountNumber=67678l;
        ss.profit=12;
        ss.money=222222;
        ss.superSaving();
        ss.takeProfit();

    }
}
