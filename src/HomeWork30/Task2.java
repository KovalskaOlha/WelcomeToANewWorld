package HomeWork30;

import java.util.TreeMap;

public class Task2 {
    public static void main(String[] args) {
        /*Create a Person class with following private fields: name, lastName, age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print user details.
In Test Class create a Map that will store key in ascending order. In that map store personId and a Person Object. Print each object details.*/

        TreeMap<Integer,Person> personTreeMap=new TreeMap<>();
        personTreeMap.put(12,new Person("Anna","Cooper",35,90000));
        personTreeMap.put(7,new Person("Jennifer","Lopes",50,1000000));
        personTreeMap.put(2,new Person("Sarah","Parker",42,230000));
        personTreeMap.put(987,new Person("Katy","Smith",41,152000));
        personTreeMap.put(32,new Person("Paul","Parker",31,340000));

        var entrySet=personTreeMap.entrySet();
        for (var entry:entrySet) {
            System.out.println("Personal ID "+entry.getKey());
            entry.getValue().print();

        }
    }
}
class Person{
    private String name;
    private String lastName;
    private int age;
    private int salary;

    public Person(String name, String lastName, int age, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }
    void print(){
        System.out.println("Name "+name+" last name "+lastName+" age "+age+" salary "+salary);
    }
}