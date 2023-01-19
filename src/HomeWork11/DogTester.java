package HomeWork11;

public class DogTester {
    public static void main(String[] args) {
        Dog Husky=new Dog();
        Husky.age=2;
        Husky.breed="Husky";
        Husky.name="Dragon";

        Dog Labrador =new Dog();
        Labrador.breed="Labrador";
        Labrador.weight=12;
        Labrador.chilling();

        Dog Bulldog = new Dog();
        Bulldog.name="Spider";
        Bulldog.protect();
    }
}
