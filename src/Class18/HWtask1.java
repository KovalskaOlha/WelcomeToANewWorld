package Class18;

public class HWtask1 {
    /*Write a java class that have 4 constructors with 4 different
    access levels of constructors(private,public,default,protected)
    and create 4 objects of this class:
    1 - inside same class;
    2 - from outside the class;
    3 - from different class inside different package  and observe result.*/


    private HWtask1(){
        System.out.println("Constructor without any parameters");
    }
    HWtask1(String name){
        System.out.println("Constructor with a String as parameter");
    }
    protected HWtask1(int a){
        System.out.println("Constructor with a int as parameter");
    }
    public HWtask1(char a){
        System.out.println("Constructor with a char as parameter");
    }

    public static void main(String[] args) {
        HWtask1 obj=new HWtask1();
        HWtask1 obj2=new HWtask1("Java");
        HWtask1 obj3=new HWtask1(1000);
        HWtask1 obj4=new HWtask1('T');

    }
}
