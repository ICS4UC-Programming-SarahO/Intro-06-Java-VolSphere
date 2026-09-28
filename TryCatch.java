/**
* Explain what your program does.
*
* @author  Sarah Ouamou
* @version 1.0
* @since   2026-09-28 */


import java.util.InputMismatchException; // Import the InputMismatchException class to handle invalid input exceptions
import java.util.Scanner; // Import the InputMismatchException class to handle invalid input exceptions

/**
 * Demonstrates input validation with a try/catch block.
 */
public final class TryCatch { // Final class to prevent inheritance
    /**
     * Prevents instantiation of this utility class.
     */
    private TryCatch() { // Prevents instantiation
    }

    /**
     * Runs the program.
     *
     * @param args command line arguments
     */
    public static void main(final String[] args) {
        final Scanner keyboard = new Scanner(System.in);
        double sphereDiam; // Declare variable for sphere diameter
        double sphereRadius; // Declare variable for sphere radius
        double sphereVolume; // Declare variable for sphere volume

        try { // Start of try block to catch exceptions
            System.out.print("Enter the diameter of a sphere: "); // Asks the user for input
            sphereDiam = keyboard.nextDouble(); // Read the user input as a double and store it in sphereDiam

            sphereRadius = sphereDiam / 2.0; // Calculate the radius of the sphere by dividing the diameter by 2
            sphereVolume = (4.0 / 3.0) * Math.PI // Calculate the volume of the sphere using the formula (4/3) * pi * r^3   
                    * Math.pow(sphereRadius, 3); // Calculate the volume of the sphere using the formula (4/3) * pi * r^3

            System.out.println("The volume is: " + sphereVolume); // Print the calculated volume of the sphere
        } catch (InputMismatchException e) { // Catch block to handle the "InputMismatchException" if the user enters invalid input
            System.out.println("Error: Please enter a valid number."); // Print an error message if the user input is invalid
        } finally { // Finally block to ensure that the Scanner object is closed regardless of whether an exception occurred or not
            keyboard.close(); // Close the Scanner object to prevent "resource leaks"
        }
    }
}
