package class20;

public class Child1 extends Parent{

    public static void main(String[] args) {
        Child1 c1=new Child1();
        c1.hello();
        //below ways to access the method by the obj, by the class name, and the class name throught the extends keyword
        c1.bye();// accessible but it not the right way
        Parent.bye();// if it is static method we can access throught class name
        Child1.bye();// accessing static method from the parent class using child class namae

       // c1.money(); private access

        c1.name="Gulhaz";
        Child1.lastName="Berik ";
        // only private does not participate

    }
}
