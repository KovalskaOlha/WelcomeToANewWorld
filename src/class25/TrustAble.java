package class25;

public interface TrustAble {
    String color="jhfd";
    int age=10;
    int trust();
    static void method(){
        System.out.println("Hello world");
    }
    default void method1(){

    }
    private void method2(){

    }
}
class Bank implements TrustAble{

    @Override
    public int trust() {
        return 0;
    }

    public static void main(String[] args) {
        TrustAble.method();
        System.out.println(TrustAble.age);
    }
}
