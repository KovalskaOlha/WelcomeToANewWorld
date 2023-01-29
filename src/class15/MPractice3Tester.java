package class15;

public class MPractice3Tester {

    public static void main(String[] args) {


        /*
        * create the object of the class that has the method
        * objectname.methodname
        *
        *
        *
        *
        * */
        MPractice3 mp=new MPractice3();

        int [] a={10,20,30};
        System.out.println(mp.SumAllElements(a));
        //OR
        System.out.println(mp.SumAllElements(new int[]{3,2,4}));

    }
}
