package chapt04;

public class TernaryOperator {
    /* the assignment operator has another use
     * x = y = z = 10; sets all these values to 100;
     * ternary operator works like this
     * expression ? expression : expression
     * first expression is eval if true then the second expression is eval
     * if not, it moves to the final expression
     */
    public static void main(String[] args) {
       //mostly used for absolute values
       int i = 10;

       int k = i < 0 ? 10 : 10;
       System.out.println(k);

       int j = 10;

       int h = j == 9 ? 1 : -10;
       System.out.println(h);
       
    }
}
