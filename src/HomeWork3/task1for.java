package HomeWork3;

public class task1for {
    public static void main(String[] args) {
        /*Create a boolean variable workDay and assign true create int variable day and assign it to 1
          As long as it is workDay print “I need a day off” and increase day.
          Once day is 6 print “I do not need a day off anymore”*/

        boolean workDay=true;
        int day=1;
        while(workDay){
            if(day<6) {
                System.out.println("I need a day off");

            }else{
                workDay=false;

            System.out.println("I do not need a day off any more");
            }day++;
        }
        for (int i = 1; i <=5 ; i++) {
            if(i<=5){
                System.out.println("I need a day off");
            }else{
                System.out.println("I do not need a day off any more");
            }

        }
    }}

