package class12;

public class CarTester {
    public static void main(String[] args) {
        // first we need to create the object of the class

        Car bmw=new Car();// bmw is an object
        bmw.make="BMW";
        bmw.model="i7";
        bmw.years=2023;
        bmw.color="Grey";
        bmw.moveForward();
        System.out.println(bmw.color+bmw.model);


        Car audi=new Car();
        audi.color="white";
        audi.model="A5";
        audi.years=2022;
        audi.applyBrakes();

    }
}
