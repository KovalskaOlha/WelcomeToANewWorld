package GroupProject2;

public interface Shape {
    double calculateArea(double a);
    double calculatePerimiter(double a);
}
class Circle implements Shape{
double radius= 12;
    @Override
    public double calculateArea(double radius) {
        return radius*radius*Math.PI;
    }

    @Override
    public double calculatePerimiter(double radius) {
        return 2*Math.PI*radius;
    }
}
class Square implements Shape{

    @Override
    public double calculateArea(double length) {
        return length*length;
    }

    @Override
    public double calculatePerimiter(double length) {
        return length*4;
    }
}
class ShapePractice{
    public static void main(String[] args) {
        Circle circle=new Circle();
        System.out.println(circle.calculateArea(10));
        System.out.println(circle.calculatePerimiter(10));

        Square square=new Square();
        System.out.println(square.calculateArea(11));
        System.out.println(square.calculatePerimiter(11));
    }
}