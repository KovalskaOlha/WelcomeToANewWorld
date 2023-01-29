package class14;

public class ReversePractice {
    public static void main(String[] args) {
        String aaa="This is sentence I want to reverse";

       String [] str2=aaa.split(" ");
        //for( String word:str2){
        //for(int i=word.length()-1; i>=0; i--){
       // System.out.print(word.charAt(i));
         // }
          //  System.out.print(" ");

        // }
        //OR easy

        for (String word:str2){
            System.out.print(new StringBuilder(word).reverse()+" ");
        }
    }
}
