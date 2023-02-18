package If;

public class EncapsPractice {
    private String name;
    private int age;

    public void setNAme(String newName){
        name=newName;
    }
    public String getName(){
        return name;
    }
}
class prac{
    public static void main(String[] args) {
        EncapsPractice ap=new EncapsPractice();
        ap.setNAme("john");
        System.out.println(ap.getName());
    }



}
