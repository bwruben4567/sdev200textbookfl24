// Bill Ruben
// p.157 Exercise 5b
import java.util.Scanner;
public class TestTeam {
    public static void main(String[] args) {
        Team Team1;
        Team Team2;
        Team Team3;
    }
    public static Team setTeamData()
        {
           Team tempTeam;
           String hsName;
           String sport;
           String teamName;
           Scanner input = new Scanner(System.in);
           System.out.print("Enter High School name >> ");
           hsName = input.nextLine();
           System.out.print("Enter sport >> ");
           sport = input.nextLine();
           System.out.print("Enter Team name >> ");
           teamName = input.nextLine();
           return tempEmp;
        }
    public static void displayTeam(Employee anEmp)
        {
           System.out.println("\nEmployee #" + anEmp.getEmpNum() +
              " Salary is " + anEmp.getEmpSalary());
        }
        
    }

