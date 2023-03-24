//The Java Boolean type can store true or false values
/**
 * For example:
 * System.out.println(10 > 9); - Will print "true" because 10 is actually greater than 9
 * result will be accordingly if another comparison operator such as "<, >, <=, >= or ==" is used.
 * System.out.println(10 == 15); - Returns false, because 10 is not equal to 15
 */

//The program below is a real life example of application of boolean data type in programming
//The program prompts the user to input their name and age

import java.util.Scanner; //Import the Scanner class from the java.util package

public class JavaBoolean{
    public static void main(String [] args){   //Declare a public main method that takes an array of strings as arguments
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter your name :");
            String myName = input.nextLine();

            System.out.print("Enter your age: ");
            int myAge = input.nextInt();//Read an integer value entered by the user using the Scanner object and store it in a variable called "age"

            int votingAge = 18;

            String message = myName + ", ";

            if (myAge >= votingAge){
                message += "You are old enough to vote!";
            }else{
                message += "You are not old enough to vote!";
            }
            System.out.println(message);
        }

    }
}
