package HomeWork13;

public class task5 {
    public static void main(String[] args) {
        //How would you check if String is palindrome or not? aba=> true
        //Abbc =>false

        String str="abba";
        String reverse="";
        boolean answer=false;

        for ( int i=str.length()-1; i >=0; i--){
            reverse=reverse+str.charAt(i);
        }
        if( str.equals(reverse)){
            answer=true;
        }
        System.out.println(answer);


    }
}
