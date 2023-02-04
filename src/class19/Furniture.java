package class19;

public class Furniture {
    String type;
    double price;
    String color;
    // with the help of constructor we can initialize obj with specific value


    Furniture(String type, double price, String color){
        this.type=type;// this is always current obj
        this.price=price;
        this.color=color;

    }
    //below is a method because of return type
  // void  Furniture(){}

    void print(){
        System.out.println(type+ " price is "+price+" and color is "+color);
    }

}
