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
        int denim = 0; //initialized

        int ratio = denim == 0 ? 1 : denim * 10; // first expression is eval
        System.out.println(ratio);
    }
}
