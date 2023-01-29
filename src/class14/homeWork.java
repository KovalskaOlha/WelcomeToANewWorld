package class14;

public class homeWork {
    public static void main(String[] args) {

        // Task 1
        String str="Batch 15 is Great";

        String newStr=str.replaceAll(" ","");
        System.out.println(newStr);


          //Task 2
        String n1="jbjhvjkJGHFYVHKJ*&^%$#8644354";

        System.out.println(n1.replaceAll("[^A-Za-z0-9]","").length());


        //Task 3

        String a="Hi? How are you? Let's go?";
        String []aarr=a.split("[?.]");
        System.out.println(aarr.length);
        System.out.println(a.split("[?]").length);//the best code

        //Task  4

        //How would you reverse a String word by word? for example
        //input=>This is sentence i want to reverse
        //output=>sihT si ecnetnes i tnaw ot esrever
       // StringBuilder a1= new StringBuilder("This is sentence i want to reverse");
       //String reverse=a1.toString();//converting a stringBuilder to String so that we can call methods from String
        //String aaa="This is sentence I want to reverse";

       // String [] str2=aaa.split(" ");
        //for( String word:str2){
            //for(int i=word.length(); i>=0; i--){
               // System.out.print(word.charAt(i));
          //  }

       // }







    }
}
