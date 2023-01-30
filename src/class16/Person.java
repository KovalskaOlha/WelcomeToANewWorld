package class16;

public class Person {
    private double bankBalance=1250000;// private means that this var can only be shared within this class
    String Address="Street 123"; // default access level is applied
    public String name="John Snow";

    private void printPassword(){
        System.out.println("pass123");
    }
    void printSNN(){
        System.out.println("1234567");
    }

    public void printTikTokAccount(){
        System.out.println("user123");
    }

    public static void main(String[] args) {
        Person person=new Person();
        System.out.println(person.bankBalance);
        System.out.println(person.Address);
        System.out.println(person.name);
        person.printPassword();
        person.printSNN();

    }
}
