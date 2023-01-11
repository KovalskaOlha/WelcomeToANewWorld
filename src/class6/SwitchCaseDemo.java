package class6;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        String country="ITALY";
        System.out.println(country.toLowerCase());//USA converted to usa
        switch (country.toLowerCase()){
            case "usa":
                System.out.println("Burgers");
                break;
            case"italy":
                System.out.println("Pasta");
                break;
            case "afghanistan":
                System.out.println("Kebab");
                break;
            default:
                System.out.println("wrong country");
        }
    }
}
