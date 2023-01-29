package HomeWork15;

public class task4 {
    //Create a method that will say Hello in different
    // language based on the country that will passed when method is executed

    String hello(String country){
        switch (country.toLowerCase()) {
            case "usa":
                return "Hello";
            case "spain":
                return "Hola";
            case "germany":
                return "Guten Tag";
            case "ukraine":
                return "Вiтаю";
            default:
                return "I have no idea";
        }
    }

    public static void main(String[] args) {
        task4 mth=new task4();
        System.out.println(mth.hello("Ukraine"));
    }
}
