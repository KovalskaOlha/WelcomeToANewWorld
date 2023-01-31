package HomeWork17;

public class Book {

    /*Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed*/
    String name;
    String author;
    String type;
    int pages;
    Book(String nameOftheBook, String authorOftheBook, String typeOftheBook, int pageAmount){
        name=nameOftheBook;
        author=authorOftheBook;
        type=typeOftheBook;
        pages=pageAmount;
    }
    Book(String au, String ty){
        author=au;
        type=ty;
    }
    void display(){
        System.out.println("The book "+name+" written by "+author+" the genre is "+ type+" consists of "+pages+" pages");
    }

}
