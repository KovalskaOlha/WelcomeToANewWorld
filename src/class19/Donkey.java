package class19;

public class Donkey {

    String name;
    int age;
    double weight;

    /*Donkey(){
        System.out.println("This is non argument constructor");
    }*/

    Donkey(String dName, int dAge){
       name= dName;
        age=dAge;
    }
    void print(){
        System.out.println("Donkey name is "+name+" age is "+age+ " and weight "+weight );
    }


}
