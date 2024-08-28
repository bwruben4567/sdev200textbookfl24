
// Bill Ruben
// p. 81 Exercise 8a
import java.util.Scanner;

public class ChiliToGo {
   public static void main(String[] args) {
      int adult;
      int child;
      double aMeal = 7.00;
      double cMeal = 4.00;
      double totAdult;
      double totChild;
      double totAll;
      Scanner inputDevice = new Scanner(System.in);
      System.out.print("Please enter the number of adult meals >> ");
      adult = inputDevice.nextInt();
      System.out.print("Please enter the number of children's meals >> ");
      child = inputDevice.nextInt();
      totAdult = adult * aMeal;
      totChild = child * cMeal;
      totAll = totAdult + totChild;
      System.out.println("Total money collected for the adult meals is  $" + totAdult +
            " and the total money collected for the children's meals is $" + cMeal
            + " The grand total of all meals is $" + totAll);
      inputDevice.close();
   }
}
