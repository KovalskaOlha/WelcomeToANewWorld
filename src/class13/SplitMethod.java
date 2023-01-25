package class13;

public class SplitMethod {
    public static void main(String[] args) {
        String str="I like java. I write a lot of code daily. I am from batch 15.";
        // breaks down the complete paragraph
        String [] strArr=str.split("[.?!]");
        System.out.println(strArr.length);//3
        System.out.println(strArr[0]);//I like java
        System.out.println(strArr[1].trim());//I write a lot of code daily  and trim() to remove the space before the string


        // whenever we are working with arrays we use the length
        //and when we are working with String we use length()



    }
}
