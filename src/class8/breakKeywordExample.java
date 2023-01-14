package class8;

public class breakKeywordExample {
    public static void main(String[] args) {

        boolean summer=true;
        int temp=75;

        while(summer){
            if(temp<=100){
                System.out.println("I love summer because the temp is "+temp);
            }else{
                System.out.println("Its very hot "+temp);
                break;
            }
            temp+=5;
        }

        boolean Summer =true;
        int Temp= 75;
        while(Summer){
            if(Temp<=100){
                System.out.println("I love the Summer because the temp is "+Temp);

            }else {
                Summer=false;
                System.out.println("IT'S too hot!");

            }
            Temp+=5;
        }


        }

    }

