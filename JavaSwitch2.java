/**
 * The Java  program below is a demonstration of the Java switch statements
 * The program prompts the user to give input
 * This code uses the Scanner class to read input from the user
 * The user is prompted to enter the value for the day,
 * and the input is read using the nextInt() method of the Scanner class.
 */

import java.util.Scanner; // Import the Scanner class from the java.util package

public class JavaSwitch2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input from the user
    System.out.print("Enter the value for the day (1-7): "); // Prompt the user to enter the value for the day
    int day = scanner.nextInt(); // Read the user input and store it in the day variable

    switch (day) { // Start a switch statement based on the value of the day variable
      case 1: // If day is equal to 1
        System.out.println("Monday"); // Print "Monday"
        break; // Exit the switch statement
      case 2: // If day is equal to 2
        System.out.println("Tuesday"); // Print "Tuesday"
        break; // Exit the switch statement
      case 3: // If day is equal to 3
        System.out.println("Wednesday"); // Print "Wednesday"
        break; // Exit the switch statement
      case 4: // If day is equal to 4
        System.out.println("Thursday"); // Print "Thursday"
        break; // Exit the switch statement
      case 5: // If day is equal to 5
        System.out.println("Friday"); // Print "Friday"
        break; // Exit the switch statement
      case 6: // If day is equal to 6
        System.out.println("Saturday"); // Print "Saturday"
        break; // Exit the switch statement
      case 7: // If day is equal to 7
        System.out.println("Sunday"); // Print "Sunday"
        break; // Exit the switch statement
      default: // If day is not equal to any of the above cases
        System.out.println("Invalid value for day"); // Print "Invalid value for day"
    }

    scanner.close(); // Close the Scanner object to release the resources
  }
}
