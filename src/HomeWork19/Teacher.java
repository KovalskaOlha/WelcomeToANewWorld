package HomeWork19;

public class Teacher {
    public String name;
    public int age;

    void beHappy(){
        System.out.println("Teacher is always in a good mood");
    }
    public void beAngry(){
        System.out.println("Teacher can be angy");
    }
    private void speakLoud(){
        System.out.println("Teacher speaks loud");
    }
    protected void speakQuiet(){
        System.out.println("Teacher speaks quiet");
    }
}
class MathTeacher extends Teacher{
    String homework;
    int exp;

    void loveMath(){
        System.out.println("Math teacher adore Math");
    }
    void count(){
        System.out.println("Counting is so exiting");
    }
}
class ChemistryTeacher extends Teacher{
    String test;
    int id;
    void loveChemistry(){
        System.out.println("Chemistry is a big love))");
    }
    void molecule(){
        System.out.println(" Teacher knows Elements and Compounds");
    }
}
class PianoTeacher extends Teacher{
    String schedule;
    int year;
    void loveMusic(){
        System.out.println("Teacher loves music");
    }
    void play(){
        System.out.println("Teacher can play piano");
    }
}
