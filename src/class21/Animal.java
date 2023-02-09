package class21;

public class Animal {
    String name;
    String color="Black";

}
class Cat extends Animal{
    String color="white";
    int age;
    double weight;
    void printColor(){
        String color="Blue";
        System.out.println(super.color);// looks inside the parent
        System.out.println(this.color);//instance var
        System.out.println(color);//local
    }
}
class AnimalTester{
    public static void main(String[] args) {
        Cat cat=new Cat();

        cat.printColor();
        //JAVA always choose a closest variable< the local one

    }
}