package class24;

public abstract class Phone {
    /* create a phone class and create abstract methods like
    * displayPictures and unlockPhone
    * sendText
    * 2 child classes Iphone Samsung Google and provide specific impl
    * lets write code to achieve runtime polymorphism*/

    abstract void displayPictures();
    abstract void unlockPhone();
    abstract void sendText();
}
class Iphone extends Phone{
    @Override
    void unlockPhone() {
        System.out.println("Iphone is easy to unlock just swipe the display");
    }

    @Override
    void sendText() {
        System.out.println("Iphone has lots of text sending options");
    }

    @Override
    void displayPictures() {
        System.out.println("Iphone has great quality of gpu");
    }
}
class Samsung extends Phone{
    @Override
    void sendText() {
        System.out.println("Samsung has lots of text sending options");
    }

    @Override
    void displayPictures() {
        System.out.println("Samsung has great quality of gpu");
    }

    @Override
    void unlockPhone() {
        System.out.println("Samsung is easy to unlock ");
    }
}
class PhoneTest{
    public static void main(String[] args) {
        Phone [] arr={new Iphone(),new Samsung()};
        for(Phone x:arr){
            x.displayPictures();
            x.unlockPhone();
            x.sendText();
        }
    }
}
