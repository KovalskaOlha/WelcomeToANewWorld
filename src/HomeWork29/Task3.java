package HomeWork29;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class Task3 {
    /*Create a Set collection that will hold Objects of Student Type.
     In this set we do not care about the insertion order.
     Each student object should have name and studentID.
      Display name of each student.*/
    public static void main(String[] args) {
        //HashSet<Student> students=new HashSet<>();
        Set<Student> students2=new HashSet<>();//we can achieve poly
        students2.add(new Student("Savo", 123));
        students2.add(new Student("Anna", 222));
        students2.add((new Student("Sasha", 333)));

        for (Student st:students2) {
            System.out.println(st.getName());

        }



    }
}
class Student{
    private String name;
    private int studentID;
    public Student(String name,int studentID){
        this.name=name;
        this.studentID=studentID;
    }

    public String getName() {
        return name;
    }

    public int getStudentID() {
        return studentID;
    }
}