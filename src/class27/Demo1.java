package class27;

public class Demo1 {
    public static void main(String[] args) {
        String name="Zafar";
        String name2="John";
        String name3="Katy";
        //if we want to store a lot of var we need to use arrays

        String [] names={"Hiral","Nima","Laura","Nat"};
        displayNames(names);
        printNames(name,name2,name3);

    }
    public static void displayNames(String [] names ){
        for(String x:names){
            System.out.println(x);
        }
    }

    public static void printNames(String name,String name2,String name3){
        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);
    }
}
