package GroupProject2;

public abstract class Marks {
    abstract double getPercentage ();
}
class A extends Marks {
    private int sub1;
   private  int sub2;
    private int sub3;

    public A(int sub1, int sub2, int sub3) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    @Override
    double getPercentage() {
        double average= (sub1+sub2+sub3)/3.0;
        return average*100.0;

    }
}
class B extends Marks{
    private  double sub1;
    private double sub2;
    private double sub3;
    private double sub4;

    public B(double sub1, double sub2, double sub3, double sub4) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
    }

    @Override
    double getPercentage() {
        double average=(sub1+sub2+sub3+sub4)/4.0;
        return average*100.0;
    }
}
class MarkTester{
    public static void main(String[] args) {
        A student1=new A(90,88,96);
        System.out.println(student1.getPercentage());

        B student2=new B(100,89,99,75);
        System.out.println(student2.getPercentage());
    }
}