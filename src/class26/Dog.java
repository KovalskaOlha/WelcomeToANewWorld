package class26;

public class Dog {

    private String name;
    private String color;
    private String breed;

    public Dog(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
class Dogtester{
    public static void main(String[] args) {
        Dog dog=new Dog("Kuku","white","maltipu");
        String name=dog.getName();
        System.out.println(name);
    }
}