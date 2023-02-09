package HomeWork20;

import java.util.SortedMap;

public class Employee {
    String gender;
    String name;
    int age;

    void printInfo(){
        System.out.println("Gender: "+gender+" Name: "+name+" Age: "+age);
    }
    void exp(){
        System.out.println("I have a lot of experience ");
    }
    Employee( String gender, String name, int age){
        this.gender=gender;
        this.name=name;
        this.age=age;
    }

}

class FullTime extends Employee{
    int workingH;

    void salary(){
        System.out.println("Our salary is bigger");
    }
    FullTime(String gender, String name, int age) {
        super(gender, name, age);
    }

}
class PartTime extends Employee{
    PartTime(String gender, String name, int age){
        super(gender, name, age);
    }

    int salary;

    void experience (){
        System.out.println("Part time job needs less experience ");
    }
}
class TesterSubClass extends FullTime{

    TesterSubClass(String gender, String name, int age) {
        super(gender, name, age);
    }

    int bonus;

    void happy(){
        System.out.println("We are so happy! Our bonus is $1000");
    }

    public static void main(String[] args) {
        TesterSubClass ts=new TesterSubClass("Male", "John", 34);
        ts.happy();
        ts.printInfo();
        ts.salary();
    }
}