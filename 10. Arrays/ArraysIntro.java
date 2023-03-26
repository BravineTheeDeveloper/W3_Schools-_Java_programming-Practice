/** JAVA ARRAYS
 * To declare an array, define the variable type with square brackets.
 * Arrays are used when you want to declare multiple variables in one variable.
 * To declare an array, define the variable type with square brackets.
 * When declaring an array of strings, they are put in curly brackets,
 * thereafter, each value is put in double quotes and separated by curly brackets.
 * for an array of strings we use:
 *              "String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};"
 * for an arrays of integers we use:
 *              "int[] myNum = {10, 20, 30, 40};"
 *
 * ARRAY TRICKS:
 * 1). To access an array element uou refer to the index number i.e [0,1,2...]
 * 2). To Change the value of a specific array, we refer to the index number of the array this way:
 *              cars[0] = "Opel";
 * 3). To find out how many elements an array has, use the length property:
 *              "System.out.println('variable name'.length);"
 */

public class ArraysIntro{
    public static void main(String[] args){
        String [] pals = {"Samson","Kevin","Max","Brian"};
        System.out.println(pals.length);
    }
}