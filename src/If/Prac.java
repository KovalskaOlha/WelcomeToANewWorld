package If;

public class Prac {
    public static void main(String[] args) {
        B obj=new B();
        obj.doing();
        obj.showing();

    }
}
interface A{
    void doing();
    void showing();
    String name = "Honey";
    int age=12;
}
class B implements A{

    @Override
    public void doing() {
        System.out.println("I.m doing ");
    }

    @Override
    public void showing() {
        System.out.println("Showing"+name);
    }

}