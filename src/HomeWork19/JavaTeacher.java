package HomeWork19;

public class JavaTeacher extends Teacher{

    void code(){
        System.out.println("Java Teacher teaches how to code");
    }

    public static void main(String[] args) {
       JavaTeacher java= new JavaTeacher();
       java.name="Asel";
       java.age=30;

       java.beHappy();//default
       java.beAngry();//public
       //java.speakLoud(); private
        java.speakQuiet();//protected
    }
}
