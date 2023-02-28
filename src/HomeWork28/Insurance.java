package HomeWork28;

import java.util.ArrayList;
import java.util.Objects;

abstract  class Insurance {
   /*
    Create 3 objects of the sub classes and store them in ArrayList.
    Using for loop/advanced for loop/ iterator access all methods of the class.

*/



     private String insuranceName;
     Insurance(String insuranceName){
         this.insuranceName=insuranceName;
     }
     public abstract double getQuote();
     public abstract void cancelInsurance();
    
}
class Car extends Insurance{
     String carModel;

    Car(String insuranceName, String carModel) {
        super(insuranceName);
        this.carModel=carModel;
    }

    @Override
    public double getQuote() {
        return 5000.0;
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Car insurance is cancelled");
    }
}
class Pet extends Insurance{
     public String petType;
     public Pet(String insurance,String petType ){
         super(insurance);
         this.petType=petType;

     }

    @Override
    public double getQuote() {
        return 200.0;
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Pet insurance is cancelled");
    }
}
class Health extends Insurance{

    Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    public double getQuote() {
        return 500.0;
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Health insurance is cancelled");
    }
}
class InsuranceTest{
    public static void main(String[] args) {
        ArrayList<Insurance> obj=new ArrayList<>();

        Car carInsurance=new Car("Insurance for cars","Tesla");
        Pet petInsurance=new Pet("Insurance for pets","Cat");
        Health healthInsurance=new Health("Insurance for health");
        obj.add(carInsurance);
        obj.add(petInsurance);
        obj.add(healthInsurance);

        for (int i = 0; i < obj.size(); i++) {
            Insurance ins=obj.get(i);
            System.out.println(ins.getQuote());
           // System.out.println(ins.cancelInsurance());
        }

        for (Insurance x:obj) {
            x.cancelInsurance();
            x.cancelInsurance();
            System.out.println(x.getQuote());
           // System.out.println(x.cancelInsurance());


        }
    }
}