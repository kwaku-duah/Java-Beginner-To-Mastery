package chapt05;

public class WhileLoopsNoBody {
    /* while loops could without body too */
  public static void main(String[] args) {
    int i, j;
    
    i = 100;
    j = 200;

    while (++i < --j) System.out.println("midpoint is " + i);
  }
}
