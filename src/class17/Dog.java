package class17;

public class Dog {
    // initialising the field
    String name;
    String breed;
    int age;
    double weight;

    //constructor

    Dog(String dogName, String dogBreed, int dogAge, double dogWeight){
        name=dogName;
        breed=dogBreed;
        age=dogAge;
        weight=dogWeight;
    }
    void printInfo(){
        System.out.println("Name "+name+" Breed "+breed+" Age " +age+ " Weight " +weight);
    }


}
