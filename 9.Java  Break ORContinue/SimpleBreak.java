/** The "Break" statement
 * The break statement is used to jump outside of a loop
 * 
 */

public class SimpleBreak {
    public static void main(String[] args) {
      for (int b = 0; b < 10; b++) {
        if (b == 4) {
          break;
        }
        System.out.println(b);
      }
    }
}