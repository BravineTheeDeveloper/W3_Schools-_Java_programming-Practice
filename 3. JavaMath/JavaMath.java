//Java math has many methods that allow you perform many mathematical operations on numbers
/**
 * They include:
 * Math.max - Prints maximum value between numbers
 * Math.min - Prints minimum value between numbers
 * Math.sqrt - Returns the square root of the number
 * Math.abs - Returns the absolute (positive) value of a number
 * Math.random() - Returns any random number between 0.0 and 1.0
 *                 To get more from the math.random, you have to declare it first as a data type
 * 
 */


public class JavaMath{
    public static void main(String [] args){
        int randomNumb = (int) (Math.random()*100);

        System.out.println(Math.max(5, 10));//Prints the maximum value between the two numbers
        System.out.println(Math.min(5, 10));//Prints the minimum value between the two numbers
        System.out.println(Math.sqrt(81));//Prints the square root of 81
        System.out.println(Math.abs(-2.4));//Prints the positive version of -2.4
        System.out.println(randomNumb);//Prints random any number from 0 to 100

    }
}