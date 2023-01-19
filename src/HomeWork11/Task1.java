package HomeWork11;

public class Task1 {
    public static void main(String[] args) {
        //Create a 2D array(shorter way) in which first array will consist
        // of 4 names and second array will contain grades.
        // Then your program should print name of the students that has A and B grade

        String [][] namesGrades={{"Anna","John","Carlie","Sarah"},
                                 {"A","C","B","A"}};
        for (int i = 0; i < namesGrades.length; i++) {
            for (int j = 0; j < namesGrades[i].length; j++) {
                if( namesGrades[i][j].equals("A") || namesGrades[i][j].equals("B"))
                System.out.println(namesGrades[0][j]);

            }

        }
    }
}
