package class17;

public class Student {
    String id;
    String name;
    int age;
    double weight;

    public Student(String studentName, String studentId, int studentAge){
        id=studentId;
        name=studentName;
        age=studentAge;
    }

    Student(String studentName, String studentId, int studentAge, double studentWeight){
       name=studentName;
       id=studentId;
       age=studentAge;
       weight=studentWeight;
    }

    void printInfo(){
        System.out.println("Name "+name+" ID "+id+" Age "+age+" Weight "+weight);
    }
}
