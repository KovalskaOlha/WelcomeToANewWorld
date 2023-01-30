package class16;

public class task4InClass {
    //Create a method that will say Hello in different language based
    // on the country that will passed when method is executed

    String sayHello(String countryName){
        switch (countryName){
            case "USA":
                return "Hello";//break is not needed
            case "Italy":
                return "Ciao";
            case" China":
                return "Ni hao";
            default:
                return "Unknown";
        }
    }

    public static void main(String[] args) {
        task4InClass mth=new task4InClass();
        System.out.println(mth.sayHello("USA"));
    }
}
