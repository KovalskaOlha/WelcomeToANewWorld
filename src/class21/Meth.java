package class21;

public class Meth {
    void calculateArea(double length, double width){
        System.out.println("Area of rectangle is "+(length*width));
    }
    void calculateArea(int a){
        System.out.println("Area of rectangle is "+(a*a));
    }

    public static void main(String[] args) {
        Meth mt=new Meth();
        mt.calculateArea(3,5);
        mt.calculateArea(3);
    }
}

