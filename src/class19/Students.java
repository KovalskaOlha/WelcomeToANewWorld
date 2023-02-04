package class19;

public class Students {
    /*Write a Student class   that have instance variables name and address.
     Create a constructor that will initialize those variables.
     Print name & address of given  student using displayInfo method.*/

    String name;
    String address;
    Students(String name,String address){
        this.name=name;
        this.address=address;
    }
    void displayInfo(){
        System.out.println("Student name "+name+" and address is "+address);
    }

    public static void main(String[] args) {
        Students st1=new Students("Katy","1000 Washington Street");
        st1.displayInfo();
    }

}
