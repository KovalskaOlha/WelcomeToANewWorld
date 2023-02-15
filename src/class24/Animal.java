package class24;

public abstract class Animal {

    abstract void speak();
   abstract void eat();
   void sleep(){
       System.out.println("Animals sleep 5 hours a day");
   }
}
class Cat extends Animal{
    @Override
    public void speak() {
        System.out.println("Meow meow meow");
    }

    @Override
    public void eat() {
        System.out.println("Fish ...");
    }
}
class Dog extends Animal{
    @Override
    public void speak() {
        System.out.println("Bark bark");
    }

    @Override
    public void eat() {
        System.out.println("Meat ...");
    }
}
class AnimalTEst{
    public static void main(String[] args) {
        Animal []arr={new Cat(),new Dog()};
        for(Animal x:arr){
            x.eat();
            x.sleep();
            x.speak();
        }
    }
}
