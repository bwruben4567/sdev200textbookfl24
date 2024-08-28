
// Bill Ruben
// p. 81 Exercise 8b
import java.util.Scanner;

public class ChiliToGoProfit {
   public static void main(String[] args) {
      int adult;
      int child;
      double aMeal = 7.00;
      double cMeal = 4.00;
      double aCost = 4.35;
      double cCost = 3.10;
      double totAdult;
      double totChild;
      double totAll;
      double totProfit;
      double totACost;
      double totCCost;
      double aProfit;
      double cProfit;
      Scanner inputDevice = new Scanner(System.in);
      System.out.print("Please enter the number of adult meals >> ");
      adult = inputDevice.nextInt();
      System.out.print("Please enter the number of children's meals >> ");
      child = inputDevice.nextInt();
      totACost = adult * aCost;
      totCCost = child * cCost;
      totAdult = adult * aMeal;
      totChild = child * cMeal;
      aProfit = totAdult - totACost;
      cProfit = totChild - totCCost;
      totAll = totAdult + totChild;
      totProfit = aProfit + cProfit;
      System.out.printf("Total profit collected for the adult meals is  $%.2f\n", aProfit);
      System.out.printf("Total profit collected for the children's meals is $%.2f\n", cProfit);
      System.out.printf(" The grand total profit of all meals is $%.2f\n", totProfit);
      inputDevice.close();
   }
}
