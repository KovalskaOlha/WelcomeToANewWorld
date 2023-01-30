package class16;

public class Student {
    String name;
    String id;
    static String School; // if we want to share the value through all classes
    int age;
    double weight;
    void printName(){
        int SSN= 2745657;
        System.out.println(name);
        System.out.println(School);

    }
    static void printStudentInfo(){
       // System.out.println(name); in static method can't access here
        System.out.println(School);
    }
}
