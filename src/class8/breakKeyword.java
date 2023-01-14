package class8;

public class breakKeyword {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("last line in our code");
    }
}
