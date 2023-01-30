package class16;

public class StudentTester {
    public static void main(String[] args) {
        Student student=new Student();
        student.name="Zafar";
        student.id="123";
        student.age=22;
        student.weight=70;
        student.School="Syntax";// static var => java don't create separate memory

        Student student1=new Student();//object
        student1.name="Hamid";
        student1.id="456";
        student1.age=32;
        student1.weight=78;
       // student1.School="Syntax";

        Student student2=new Student();
       // student2.name="Nelson"; // instance value
        student2.id="789";
        student2.age=26;
        student2.weight=90;
       // student2.School="Syntax";


        System.out.println(student2.School);
        System.out.println(Student.School);// another way that you might see a lot access static var
        System.out.println(student2.name);
    }
}
