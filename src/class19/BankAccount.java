package class19;

public class BankAccount {//parent class or super class
    long accountNumber;
    double money;
    void deposit(){
        System.out.println("Deposit method from Bank account class");
    }
}

class Checking extends BankAccount{//child class or sub class, or derived class
    double interest;
    void transfer(){
        System.out.println("transfer method from Checking class");

    }
}

class Savings extends BankAccount{
    double profit;
    void takeProfit(){
        System.out.println("Profit method from Savings class");
    }
}
class SuperSavings extends Savings{
    void superSaving(){
        System.out.println("Super saving method from Super Saving Class");
    }
}
