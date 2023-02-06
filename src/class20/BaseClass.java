package class20;

public class BaseClass {
    String name="John";

    void hello(){
        System.out.println("Hello method from BaseClass");
    }
}

class ChildClass extends BaseClass{
    String name="Jane";

    void callMe(){
        System.out.println(name);
        System.out.println(super.name);
    }
    void hello(){
        System.out.println("Hello method from a ChildClass");
    }


    void callingParentMethod(){
        hello();
        super.hello();// refer to a parent method
    }
}
