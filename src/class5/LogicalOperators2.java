package class5;

public class LogicalOperators2 {
    public static void main(String[] args) {
        double mathScore=90.2;
        double historyScore=91.5;
        double ScienceScore=93.5;

        if(mathScore>90&&historyScore>90&&ScienceScore>90){
            System.out.println("good ");

        }else{
            System.out.println("work harder");
        }

        if(mathScore>90.0){
            if(historyScore>90){
                if(ScienceScore>90){
                    System.out.println("You are a brilliant Student");
                }else{
                    System.out.println("You need work harder is Science");
                }
            }else{
                System.out.println("You need work harder in history");
            }

        }else{
            System.out.println("You need work harder with Math");
        }


        if(mathScore>90&&historyScore>90&&ScienceScore>90){
            System.out.println("You are a brilliant Student");
        }else{
            System.out.println("You need work harder");
        }


    }
}
