package class16;

public class PersonTester {
    public static void main(String[] args) {
        Person person=new Person();
       // System.out.println(person.bankBalance);
        System.out.println(person.Address);
        System.out.println(person.name);
        person.printSNN();
       // person.printPassword(); no because private
        person.printTikTokAccount();
    }
}
