package chapt05;

public class WhileLoops {
    /* while loops are very fundamental in java
     * while ( condition) statement; or block of statements;
     * it evaluates so long as an expression is true
     * if a while loops condition is false, it wont even evaluate
     */
    public static void main(String[] args) {
        int n = 10;

        while ( n > 0){
            System.out.println("tick is " + n);
            n--;
        }
    }
    

}
