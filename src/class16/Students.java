package class16;

public class Students {
    String name;
    String id;
   static int numbersOfStudents;


    public static void main(String[] args) {
        Students st1=new Students();
        st1.name="John";
        st1.id="a111";
        st1.numbersOfStudents++;

        Students st2=new Students();
        st2.name="Sarah";
        st2.id="a222";
        st2.numbersOfStudents++;

        Students st3=new Students();
        st3.name="Bob";
        st3.id="a333";
        st3.numbersOfStudents++;

        System.out.println(Students.numbersOfStudents);
    }
}
