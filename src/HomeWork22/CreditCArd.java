package HomeWork22;

public class CreditCArd {
    /*Create a class CreditCard and define variable balance and interest.
    Create an instance method that will calculate interest based on the given balance.
    Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    Call the method by creating an object of each of the three classes.*/

    double balance;
    int interest;

    public CreditCArd(double balance, int interest) {
        this.balance = balance;
        this.interest = interest;
    }

    double calc(double balance, int interest){
        return (balance*interest/100);
    }
}
class Visa extends CreditCArd{

    public Visa(double balance, int interest) {
        super(balance, interest);
    }
}
class AX extends CreditCArd{
    public AX(double balance, int interest) {
        super(balance, interest);
    }
@Override
    double calc(double balance, int interest){
        return (balance*interest/100+22);
    }
}
class Test{
    public static void main(String[] args) {
        CreditCArd cc=new CreditCArd(30000,11);
        System.out.println("The interest of credit card is "+cc.calc(30000,11));
        Visa vs=new Visa(20000,33 );
        System.out.println("The interest of visa is "+vs.calc(20000,33));
        AX ax=new AX(45000,3);
        System.out.println("The interest of ax is "+ax.calc(45000,3));

    }


}