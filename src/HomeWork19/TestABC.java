package HomeWork19;

public class TestABC {
    public static void main(String[] args) {
        A a=new A();
        a.a1=12;
        a.aa="Something";
        a.methodA();

        B b=new B();
        b.methodA();
        b.methodB();
        b.printF();

        C c=new C();
        c.methodA();
        c.methodB();
        c.methodC();
        c.printF();
    }
}
