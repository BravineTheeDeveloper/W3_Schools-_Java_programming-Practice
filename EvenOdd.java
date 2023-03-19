import java.util.Scanner; // Importing the Scanner class from the java.util package

public class EvenOdd { // Creating a class named EvenOdd
    public static void main(String[] args) { // Main method where the program execution starts
        Scanner input = new Scanner(System.in); // Creating an object of Scanner class named input
        System.out.print("Enter a number: "); // Prompting the user to enter a number
        int num = input.nextInt(); // Reading the integer entered by the user and storing it in variable num

        if (num % 2 == 0) { // Checking if num is divisible by 2 with no remainder
            System.out.println(num + " is even."); // If num is even, printing "num is even"
        } else { // If num is not divisible by 2 with no remainder
            System.out.println(num + " is odd."); // Printing "num is odd"
        }
    }
}
