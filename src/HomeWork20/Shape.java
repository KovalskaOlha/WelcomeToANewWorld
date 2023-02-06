package HomeWork20;

public class Shape {

    double radius;

    Shape(double radius){
        this.radius=radius;
    }
}
class Circle extends Shape{

    double pi=3.14;
    double area=pi *(radius*radius);
    Circle(double radius){
        super(radius);
    }

    void printResult(){
        System.out.println("The area of the circle is "+area);
    }

    public static void main(String[] args) {
        Circle ci=new Circle(7.5);
        ci.printResult();


    }
}

