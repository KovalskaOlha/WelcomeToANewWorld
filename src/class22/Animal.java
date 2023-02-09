package class22;

public class Animal {
    String name;
    String color;
    int age;
    double weight;
    void speak(){
        System.out.println("Animal can speak");
    }
    void eat(){
        System.out.println("All animals eat");
    }
}
class Cat extends Animal{
    //we are overriding speak method in Cat class
    void speak(){
        System.out.println("Meow meow...");
    }
}
class Dog extends Animal{

}
class Tester{
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.speak();

    }
}