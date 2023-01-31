package HomeWork17;

public class BookTester {
    public static void main(String[] args) {
        Book one=new Book("The little Prince ", "Antoine de Saint-Exupery", "adventure", 155);
        one.display();

        Book two=new Book("JK Rowling","fantasy");
        two.display();
    }
}
