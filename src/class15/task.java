package class15;

public class task {
    String createEmail(String name,String lastname,String email){
        return name+lastname+"@"+email+".com";
    }

    public static void main(String[] args) {
        task mp=new task();
        System.out.println(mp.createEmail("John","Snow","gmail").toLowerCase());

    }
}
