package class27;

public class Demo2 {
    //method that search for us
    public static void main(String[] args) {
        String name="Savo";
        String [] names={"Hiral","Nima","Laura","Nat"};
        System.out.println(contains(name,names));

    }

    public static boolean contains(String nameToBeSearch,String[]names){

        for(String name:names){
            if(nameToBeSearch.equals(name)){
                return true;
            }
        }
        return false;
    }
}
