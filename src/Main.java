//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner in = new Scanner(System.in);

        // Define variables
        double itemPrice = 0;
        double shippingCost = 0;
        double totalPrice = 0;
        String trash = "";

        // Prompt user for item price
        System.out.print("Enter the item price: $");

        // Validate input for double
        if (in.hasNextDouble()) {
            itemPrice = in.nextDouble();
            in.nextLine(); // Clear the buffer

            // Determine shipping cost
            if (itemPrice >= 100) {
                shippingCost = 0.0;
            } else {
                shippingCost = itemPrice * 0.02;
            }

            totalPrice = itemPrice + shippingCost;

            // Display results
            System.out.printf("Shipping Cost: $%.2f%n", shippingCost);
            System.out.printf("Total Price: $%.2f%n", totalPrice);
        } else {
            trash = in.nextLine();
            System.out.println("\nYou entered an invalid price: " + trash);
            System.out.println("Run the program again and enter a valid number!");
        }
    }
}