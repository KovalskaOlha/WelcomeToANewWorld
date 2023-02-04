package If;

public class KeyWordsPractice {

    String name;
    int a;

     protected void print(String name, int a){
        System.out.println(name+a);
    }

    public static void main(String[] args) {
        KeyWordsPractice obj=new KeyWordsPractice();
        obj.print("elena ", 32);
    }
}
