package HomeWork23;

public class Computer {

    /*Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
Define common behavior within and some fields in parent class and override some of the methods in child classes
Define some methods specific to child classes
Create objects of child classes and store them into array. Loop through each object and execute available methods.*/

    public void ram(){
        System.out.println("Each computer has a Random Access Memory");
    }
    public void gpu(){
        System.out.println("Each computer has a Graphics Processing Unit ");
    }
    public void motherboard(){
        System.out.println("Each computer has motherboard");
    }
}
class Apple extends Computer{

    public void play(){
        System.out.println("time play ");
    }
    @Override
    public void ram() {
        System.out.println("Apple computer has a Random Access Memory");
    }

    @Override
    public void gpu() {
        System.out.println("Apple computer has a Graphics Processing Unit ");
    }

    @Override
    public void motherboard() {
        System.out.println("Apple computer has motherboard");
    }


}

class Lenovo extends Computer{
    @Override
    public void ram() {
        System.out.println("Lenovo computer has a Random Access Memory");
    }

    @Override
    public void gpu() {
        System.out.println("Lenovo computer has a Graphics Processing Unit ");
    }

    @Override
    public void motherboard() {
        System.out.println("Lenovo computer has motherboard");
    }
}
class HP extends Computer{
    @Override
    public void ram() {
        System.out.println("HP computer has a Random Access Memory");
    }

    @Override
    public void gpu() {
        System.out.println("HP computer has a Graphics Processing Unit ");
    }

    @Override
    public void motherboard() {
        System.out.println("HP computer has motherboard");
    }
}
class Dell extends Computer{
    @Override
    public void ram() {
        System.out.println("Dell computer has a Random Access Memory");
    }

    @Override
    public void gpu() {
        System.out.println("Dell computer has a Graphics Processing Unit ");
    }

    @Override
    public void motherboard() {
        System.out.println("Dell computer has motherboard");
    }
}

class TestComputers{
    public static void main(String[] args) {
        Computer [] comps={new Apple(),new Dell(), new HP(), new Lenovo()};
        for(Computer x:comps){
            x.gpu();
            x.ram();
            x.motherboard();

            if(x instanceof Apple){
                Apple app=(Apple)x;// converting var c back to an apple obj
                app.play();
            }

        }
        // if we want to call a specific meth from child class
       // Apple app=(Apple)x;
       // app.play();
    }
}