package HomeWork19;

public class A {
    int a;
    int a1;
    String aa;
    void methodA(){
        System.out.println("Method from Class A");
    }
   static void printF(){
       System.out.println("Static method from class A");
    }
}
class B extends A{
    int b;
    String bb;
    void methodB(){
        System.out.println("Method from class B");
    }

}
class C extends B{
    int c;
    String cc;
    void methodC(){
        System.out.println("Method from class C");
    }
}

