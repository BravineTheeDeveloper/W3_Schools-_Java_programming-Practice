/**MULTI-DIMENSIONAL ARRAYS
 * Multidimensional arrays are useful when you want to store data as a tabular form,
 *          just like table and rows.
 *
 * MULTIDIMENSIONAL ARRAYS TRICKS.
 * 1). To create a two-dimensional array, add each array within its own set of curly braces ie:
 *          "int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };"
 * 2). To access the elements of the myNumbers array, specify two indexes:
 *     one for the array, and one for the element inside that array. Example:
 *          "System.out.println(myNumbers[1][2]); // Outputs the second and the third elements"
 * 3). To change elements values we can use:
 *          "myNumbers[1][2] = 'The change to be implied';"
 */

//We can also use a for loop inside another for loop to get the elements of a two-dimensional array
//(we still have to point to the two indexes), below is an example

public class Multidimensional {
    public static void main(String[] args){
        int [][] myNumbers = {{9,8,7}, {6,5,4}};

        for (int a = 0; a < myNumbers.length; a++){
            for (int b= 0; b < myNumbers.length; b++){
                System.out.println(myNumbers[a][b]);
            }
        }
    }
}