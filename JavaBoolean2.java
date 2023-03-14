//This is a simple Java program demonstrating how the boolean function works
// we use the >= comparison operator to find out if the age (25) is greater than OR equal to the voting age limit

public class JavaBoolean2 {
    public static void main(String[] args) {
      int myAge = 25;
      int votingAge = 18;

      if (myAge >= votingAge) {
        System.out.println("Old enough to vote!");
      } else {
        System.out.println("Not old enough to vote.");
      }
    }
  }
