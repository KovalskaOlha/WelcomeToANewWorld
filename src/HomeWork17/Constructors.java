package HomeWork17;

public class Constructors {
    /*Write a java class that have 4 constructors with 4 different access
    levels of constructors(private,public,default,protected) and create
    4 objects of this class: 1 - inside same class; 2 - from outside the class;
     3 - from different class inside different package  and observe result.*/
    String name;
    String country;
    int age;
    String pet;
    String occupation;
    private Constructors(String n,String c, int a, String oc){
        name=n;
        country=c;
        age=a;
        occupation=oc;

    }
    public Constructors(String n, int a, String c, String oc, String p){
        name=n;
        age=a;
        country=c;
        occupation=oc;
        pet=p;
    }
    Constructors(String c, String n){
        country=c;
        name=n;
    }
    protected Constructors(int a, String n){
        age=a;
        name=n;
    }
    void printAll(){
        System.out.println(name+" "+country+" "+age+" "+occupation+" "+pet);
    }


    public static void main(String[] args) {
        Constructors qq=new Constructors("Anna",22,"Italy","Designer", "dog");
        qq.printAll();
    }


}
