package HomeWork13;

public class task4 {
    public static void main(String[] args) {
        //How would you reverse a String word by word? for example
        //        // input=>This is sentence i want to reverse
        //        // output=>sihT si ecnetnes i tnaw ot esrever

        String str="This is sentence I want to reverse";

        String [] str1=str.split(" ");
        String reverseString="";
        for(String x:str1){
            StringBuilder sb=new StringBuilder(x);
            sb.reverse();
            reverseString=reverseString+sb.toString()+" ";
        }
        System.out.println(reverseString);
    }
}
