package class16;

public class SyntaxEmployee {
    int empID; //instance because diff value for each var
    int salary;
    static String CEO="Sumair"; // static because the same value for each

    public static void main(String[] args) {
        SyntaxEmployee sm=new SyntaxEmployee();
        sm.empID=123;
        sm.salary=150000;
        System.out.println(sm.empID +" and "+sm.salary+" and "+ sm.CEO);

        SyntaxEmployee sm1=new SyntaxEmployee();
        sm1.empID=456;
        sm1.salary=200000;
        System.out.println(sm1.empID +" and "+sm1.salary+" and "+ sm1.CEO);
    }




}
