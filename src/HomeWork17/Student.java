package HomeWork17;

public class Student {
    /*Write a java Class Students that have a constructor
    which takes students name and 3 subject grades.
     Inside your class also have a method to Calculate Average Grade.
     Test Student class for 5 different students with different marks.
     Your program should print an average mark of each students name.
NOTE: please use different names for instance and local variables.
*/

    String name;
    int sub1;
    int sub2;
    int sub3;
    int average= (sub1+sub2+sub3)/3;


    Student(String nameSt, int g1, int g2, int g3){
        name=nameSt;
        sub1=g1;
        sub2=g2;
        sub3=g3;
        average=(g1+g2+g3)/3;
    }
    void printInfo(){
        System.out.println("Name is "+name+" and average grade is  "+average);
    }
}
