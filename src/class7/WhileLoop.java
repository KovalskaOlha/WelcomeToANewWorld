package class7;

public class WhileLoop {
    public static void main(String[] args) {
        int number=10;
        while (number<20){
            System.out.println(number<20);
            if(number<15){
                System.out.println("number is still less than 15");
            }else {
                System.out.println("Number is greater than 15 now");
            }
            System.out.println(number);
            number++; //increase the value of number by one

        }

        boolean workDay=true;
        int day=1;
        while(workDay){
            if(day<=5){
                System.out.println("I need a day off");
            }else{
                System.out.println("I do not need a day off");
                workDay=false;

            }
            day++;  // or day=day+1 or day+=1;
        }
    }
}
