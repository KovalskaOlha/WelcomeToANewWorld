package class12;

public class StringDemo {
    public static void main(String[] args) {
        String strObj=new String("Java");//we create an object of the String class

       //another way to creating an object of String class a shorter way
        //mostly this is how we create the object of String class

        String strObj2="Java";
        System.out.println(strObj2.length());//length is a method
        String str="Banana ";
        int len=str.length(); // output will be int numbers of characters
        System.out.println(len);
        String name="Hamid Poya ";
        if(name.length()>10){
            System.out.println("Name can not be more than 10 letters");
        }

    }
}
