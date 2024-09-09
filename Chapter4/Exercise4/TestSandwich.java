// Bill Ruben
// Exercise 4-1 p.156

import java.util.Scanner;

public class TestSandwich {
    public static void main(String[] args) {
        String main;
        String bread;
        double price;

        Sandwich firstSandwich = new Sandwich();
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter main filling for your sandwich >> ");
        main = keyboard.nextLine();
        System.out.print("Enter the bread type for your sandwich >> ");
        bread = keyboard.nextLine();
        System.out.print("Enter price >> ");
        price = keyboard.nextDouble();
        keyboard.nextLine();
        firstSandwich.setMain(main);
        firstSandwich.setBread(bread);
        firstSandwich.setPrice(price);
        System.out.println("My order details: ");
        System.out.println("I ordered a " + firstSandwich.getMain() +
                " sandwich on " + firstSandwich.getBread() + " bread " +
                "at a price of $" + firstSandwich.getPrice());

    }

}
