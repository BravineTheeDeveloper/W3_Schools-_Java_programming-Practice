import java.util.Scanner; // Importing the Scanner class from the java.util package

public class PositiveNegative { // Creating a class named PositiveNegative
    public static void main(String[] args) { // Main method where the program execution starts
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a number: "); // Prompting the user to enter a number
            int num = input.nextInt(); // Reading the integer entered by the user and storing it in variable num

            if (num > 0) { // Checking if num is greater than zero
                System.out.println(num + " is a positive number."); // If num is greater than zero, printing "num is positive"
            } else if (num < 0) { // If num is not greater than zero, checking if it is less than zero
                System.out.println(num + " is a negative number."); // If num is less than zero, printing "num is negative"
            } else { // If num is not greater than zero and not less than zero, then it must be equal to zero
                System.out.println("The number is zero."); // Printing "The number is zero"
            }
        }
    }
}
