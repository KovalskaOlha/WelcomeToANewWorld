package class6;

public class IncrementOperator {
    public static void main(String[] args) {

        int number=10;
        number=number+1;//incremented the number by 1
        System.out.println(number);//11
        number+=1;
        System.out.println(number);//12
        number++;//also increments the number by 1
        System.out.println(number);//13

        int number2=10;
        number2--;
        System.out.println(number2);//9
    }
}
