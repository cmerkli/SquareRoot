/* Programmer: Cyntia Merkli
 * Date: October 07 2020
 * Purpose: Square root a number, and keep asking in number is negative
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class SquareRoot {
    public static void main (String [] args) {
        // Create the input scanner
        Scanner input = new Scanner(System.in);

        // Ask the user for the diameter
        System.err.print("Enter a number to square root: ");
        double radicand = input.nextDouble();

        // Check that the input is not negative
        while (radicand < 0) {
        	System.err.println("Invalid input!");
        	System.err.print("Enter a number to square root: ");
        	radicand = input.nextDouble();
        }
        if (radicand < 0) {
            System.err.println("Invalid input!");
            System.exit(1);
        }

        // Calculate the circumference
        double root = Math.sqrt(radicand);

        // Create a decimal formatter
        DecimalFormat formatter = new DecimalFormat("#,###.##");

        // Print the results
        System.out.println("The square root of " + formatter.format(radicand) + 
                " is " + formatter.format(root) + ".");
    }
}
