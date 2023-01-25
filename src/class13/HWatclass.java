package class13;

public class HWatclass {
    public static void main(String[] args) {
        String str="hello";
        if(!str.isEmpty()){
            //str.length()%2!=0 this condition check if number of character are odd
            if(str.length()%2!=0 && str.length()>3){
                int middle= str.length()/2;
                System.out.println(str.charAt(middle));
            }
        }
    }
}
