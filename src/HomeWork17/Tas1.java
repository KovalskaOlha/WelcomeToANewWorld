package HomeWork17;

public class Tas1 {
    /* Write a java class that will have a constructor:
    one with parameters and second without any parameters.
    Create a separate Test class where you will execute both
    of the constructors 1 by 1.*/

    String name;
    String country;
    int age;
    int date;

    public  Tas1(String friendName, String friendCountry, int friendAge, int friendDate){
        name=friendName;
        country=friendCountry;
        age=friendAge;
        date=friendDate;
    }
    public Tas1(){
        name="Jimmy";
        country="USA";
        age=21;
        date=1109;


    }
    void printInf(){
        System.out.println("Name "+name+" Country"+country+" Age "+age+" Date"+date);
    }
}
