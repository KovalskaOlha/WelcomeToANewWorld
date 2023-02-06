package class20;

public class SportTest {
    public static void main(String[] args) {
      Cricket crick=  new Cricket("Cricket","Pakistan","blue");
      crick.display();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

      Soccer sc=new Soccer("Soccer", "Argentina","Olivers",12);
        sc.display();
      sc.displayTeam();

    }
}
