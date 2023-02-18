package GroupProject2;

public abstract class Car {
    double carPrice;
    String color;

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    public double calculateSalePrice(){
        return carPrice;
    }
}
class Sedan extends Car{
   private double length;

    public Sedan(double carPrice, String color, double length) {
        super(carPrice, color);
        this.length=length;
    }

    public double calculateSalePrice(){
       if( length>20){
           return super.calculateSalePrice()*0.95;
       }else{
           return  super.calculateSalePrice()*0.9;
       }
    }

}
class Truck extends Car{
    private double weight;

    public Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight=weight;
    }

    public double calculateSalePrice(){
        if( weight>200){
            return super.calculateSalePrice() *0.9;
        }else{
            return  super.calculateSalePrice()*0.8;
        }
    }

}
class CarTester{
    public static void main(String[] args) {
        Sedan sedan=new Sedan(55000, "white", 19);
        System.out.println(sedan.calculateSalePrice());

        Truck truck=new Truck(10000,"black",180);
        System.out.println(truck.calculateSalePrice());

    }
}
