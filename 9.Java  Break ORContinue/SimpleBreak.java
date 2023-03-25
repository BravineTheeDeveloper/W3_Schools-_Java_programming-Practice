/** The "Break" statement
 * The break statement is used to jump outside of a loop
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

//The above code is applied when suing a for loop
//If one is to use a while loop the one bellow would work
/**
 * int i = 0;
while (i < 10) {
  System.out.println(i);
  i++;
  if (i == 4) {
    break;
  }
}
 */