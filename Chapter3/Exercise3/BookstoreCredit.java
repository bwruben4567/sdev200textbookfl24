
// Bill Ruben
// p.112 Chapter 3 Exercise 5
import java.util.Scanner;

public class BookstoreCredit {
    public static void main(String[] args) {

        double gpa;
        String name;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the name of the student >>");
        name = keyboard.nextLine();
        System.out.print("Enter the GPA for the student >>");
        gpa = keyboard.nextDouble();
        displayInfo(name, gpa);
    }

    public static void displayInfo(String name, double gpa) {
        double credit;
        credit = gpa * 10;
        System.out.println("Congratulations " + name + "!");
        System.out.println("Your GPA is " + gpa + " and your bookstore credit is $" + credit);
    }
}
