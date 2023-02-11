package class23;

public class Student {
    /*Create a Class Student that will have 3 subclasses as SyntaxStudent,
    CollegeStudent, SchoolStudent.
    Define common behavior within parent class and override
     some of the methods in child classes
    Define some methods specific to child classes
    Write example of achieving run time polymorphism
*/
    public void studing(){
        System.out.println("All students are studying");
    }
    public void exploring(){
        System.out.println("All students are exploring");
    }
    public void testing(){
        System.out.println("All students are passing the tests");
    }

}
class SyntaxStudent extends Student{
    @Override
    public void studing() {
        System.out.println("Syntax students are studying");
    }

    @Override
    public void exploring() {
        System.out.println("Syntax students are exploring");
    }

    @Override
    public void testing() {
        System.out.println("Syntax students are passing the tests");
    }
}
class CollegeStudent extends Student{
    @Override
    public void studing() {
        System.out.println("College  students are studying");
    }

    @Override
    public void exploring() {
        System.out.println("College students are exploring");
    }

    @Override
    public void testing() {
        System.out.println("College students are passing the tests");
    }
}
class SchoolStudent extends Student{
    @Override
    public void studing() {
        System.out.println("School  students are studying");
    }

    @Override
    public void exploring() {
        System.out.println("School students are exploring");
    }

    @Override
    public void testing() {
        System.out.println("School students are passing the tests");
    }
}

class Testing{
    public static void main(String[] args) {
        Student [] arr={new SyntaxStudent(),new CollegeStudent(),new SchoolStudent()};
        for(Student x:arr){
            x.exploring();
            x.testing();
            x.studing();
        }
    }
}