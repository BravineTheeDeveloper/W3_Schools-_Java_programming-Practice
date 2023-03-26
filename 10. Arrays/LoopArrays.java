/** # Looping Through Arrays!
 * When looping through an array, we use the "length" property.
 */

public class LoopArrays {
    public static void main(String[] args){
        String [] pals = {"Mark","John","Mason","Paul"};

        //The "pals.length" gets the loop to loop through the entire string there all it's elements will be printed
        for (int p = 0; p < pals.length; p++){
            System.out.println(pals[p]);
        }
    }
}

/**Another way to loop through an array is using the for each loop:
 *          for (String i : cars)
 * The example above can be read like this: for each String element (called i - as in index) in cars,
 * print out the value of i.
 */