package ProjectGroup;

public class Task11 {
    public static void main(String[] args) {
        String [] names={"Love","Passion","Dignity","Kindness","Love"};

        for (int i = 0; i < names.length; i++) {
            for (int j = i+1; j < names.length ; j++) {
                if(names[i]==names[j]){
                    System.out.println("The duplicate value is "+names[i]);
                }

            }

        }
    }
}
