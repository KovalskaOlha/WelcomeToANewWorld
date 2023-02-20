package HomeWork28;

import java.util.Iterator;
import java.util.LinkedList;

public abstract class CardClass {
    /*Create a Card class that will have interest rate field and card type
  and a constructor that will initialize the fields.
  Create 3 objects of different card and store them into LinkedList.
  Using for loop/advanced for loop/ iterator access all methods of the class.*/
    private double interest;
    private String type;
    CardClass(double interest,String type){
        this.interest=interest;
        this.type=type;
    }
    public double getInterestRate() {
        return interest;
    }

    public String getCardType() {
        return type;
    }
}
class Visa extends CardClass{

    Visa(double interest, String type) {
        super(interest, type);
    }
}
class MasterCard extends CardClass{

    MasterCard(double interest, String type) {
        super(interest, type);
    }
}
class VisaSuper extends CardClass{

    VisaSuper(double interest, String type) {
        super(interest, type);
    }
}
class CardClasstest{
    public static void main(String[] args) {
        LinkedList<CardClass> cards=new LinkedList<>();
        Visa visa=new Visa(8.9,"Black");
        MasterCard mc=new MasterCard(11.1,"Gold");
        VisaSuper vs=new VisaSuper(5.5, "White");
        cards.add(visa);
        cards.add(mc);
        cards.add(vs);

        for (int i = 0; i < cards.size(); i++) {
         CardClass cd=cards.get(i);
            System.out.println(cd.getCardType());
            System.out.println(cd.getInterestRate());
        }
        System.out.println("_______________________");

        for (CardClass x:cards) {
            System.out.println(x.getInterestRate());
            System.out.println(x.getCardType());
        }
        System.out.println("_______________________");
        Iterator<CardClass>iterator=cards.iterator();
        while (iterator.hasNext()) {
            CardClass cd = iterator.next();
            System.out.println(cd.getCardType());
            System.out.println(cd.getInterestRate());
        }

    }
}

