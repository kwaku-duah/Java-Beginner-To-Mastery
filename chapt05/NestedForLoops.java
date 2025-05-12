package chapt05;

public class NestedForLoops {
    /* Java allows for loops to be nested */
  public static void main(String[] args) {
    int i, j;

    for (i = 0; i < 10; i++){
        for(j = i; j < 10; j++) System.out.print("*");
        System.out.println();
    }
  }
}
