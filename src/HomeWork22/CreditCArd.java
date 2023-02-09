package HomeWork22;

public class CreditCArd {
    /*Create a class CreditCard and define variable balance and interest.
    Create an instance method that will calculate interest based on the given balance.
    Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    Call the method by creating an object of each of the three classes.*/

    double balance;
    int interest;

    double calc(double balance, int interest){
        balance=20000;
        interest=11;
        return (balance*interest/100);
    }
}
class Visa extends CreditCArd{

}
class AX extends CreditCArd{
    double calc(double balance, int interest){
        balance=45000;
        interest=3;
        return (balance*interest/100);
    }
}
class Test{
    public static void main(String[] args) {
        CreditCArd cc=new CreditCArd();
        System.out.println("The interest of credit card is "+cc.calc(30000,11));
        Visa vs=new Visa();
        System.out.println("The interest of visa is "+vs.calc(20000,33));
        AX ax=new AX();
        System.out.println("The interest of ax is "+ax.calc(45000,3));

    }


}