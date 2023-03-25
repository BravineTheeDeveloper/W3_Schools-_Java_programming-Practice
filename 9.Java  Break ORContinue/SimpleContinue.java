/**
 * The continue statement breaks one iteration (in the loop)
 * if a specified condition occurs and continues with the next iteration in the loop
 */

public class SimpleContinue {
    public static void main(String[] args){
    for (int b = 0; b < 10; b++) {
        if (b == 4) {
          continue;
        }
        System.out.println(b);
      }
    }
}