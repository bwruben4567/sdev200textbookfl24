import java.util.Scanner;
public class TestAn
{
   public static void main(String[] args)
   {
	  Team team1, team2, team3;
	  
      team1 = setTeamData(); 
      team2 = setTeamData(); 
      team3 = setTeamData(); 
      display(team1);
      display(team2);
      display(team3);
   }
   public static Team setTeamData()
   {
      Scanner input = new Scanner(System.in);
      Team temp;
      String name, sport, mascot;
      System.out.print("Enter school name >> ");
      name = input.nextLine();
      System.out.print("Enter sport >> ");
      sport = input.nextLine();
      System.out.print("Enter mascot >> ");
      mascot = input.nextLine();
      temp = new Team(name, sport, mascot);
      return temp;
   }
   public static void display(Team t)
   {
      System.out.println(t.gethsName() + " " + t.getSport() +
         " team " + t.getTeamName() + "\n   Our motto is " +
         t.MOTTO);
   }
}
