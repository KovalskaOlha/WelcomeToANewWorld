package class25;

public interface Movable {
    void move();
}
 interface Flyable{
    void fly();
}
class Car implements Movable,Flyable{
    @Override
    public void move() {
        System.out.println("I can move");
    }

    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}
class Dog implements Movable,Flyable{

    @Override
    public void move() {
        System.out.println("I can move");
    }

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
