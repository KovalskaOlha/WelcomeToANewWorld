package class17;

public class StudentTester {
    public static void main(String[] args) {
        Student st1=new Student("Alex","A12A", 27,50);
        st1.printInfo();
        Student st2=new Student("Katy","B22B",33, 62);
        st2.printInfo();
        Student st3=new Student("Timm","RD545",31,78);
        st3.printInfo();
        Student st4=new Student("Inna","Q21",33,55);
        st4.printInfo();
        Student st5=new Student("Dima","I445", 29,77);
        st5.printInfo();
                    //another constructor with 3 parameter
        Student st6=new Student("Kim", "D453",89);
        st6.printInfo();
    }
}
