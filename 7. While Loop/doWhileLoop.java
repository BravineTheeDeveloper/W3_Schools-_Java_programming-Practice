/**
 * This program demonstrates a simple use of the "do while loop"
 * The do/while loop is a variant of the while loop
 * This loop will execute the code block once,
 * before checking if the condition is true,
 * then it will repeat the loop as long as the condition is true.
 */

public class doWhileLoop {
    public static void main(String[] args){
        int b = 0;

        do{
            System.out.println(b);
            b++;
        }
        while (b > 10);
    }
}

//The loop will always be executed at least once even if the condition id false.
//This is because the code block is executed before the condition is tested.