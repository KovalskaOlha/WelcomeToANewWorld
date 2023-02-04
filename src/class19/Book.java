package class19;

public class Book {
    /*Write Book class that will have instance variables and 2 Constructors.
     While creating an object make sure:
    Instance variables are being initialized
      Both Constructors are being executed*/

    String name;
    String author;
    int price;

    Book(String name, int price){
        this.name=name;
        this.price=price;
        System.out.println("Book "+name+" costs "+price);
    }
    Book(String name, int price, String author){
        this(name,price);
        this.author=author;
        System.out.println("The book "+name+" written by "+ author+" costs "+price);
    }

    public static void main(String[] args) {
        Book b1=new Book("Harry Potter", 20);

        Book b2=new Book("Da Vinci Code", 32, "Dan Brown");
    }
}
