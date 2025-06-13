package chapt17;

/* using arrow case with switch expressions
 * 
 */

public class StatementArrow {
    public static void main(String[] args) {
        int up = 0, down = 0, left = 0, right = 0;

        char redirection = 'R';

    //use arrow case in switch statement

    switch (redirection) {
        case 'L' -> {
            System.out.println("Turning left");
            left++;
        }
        case 'R' -> {
            System.out.println("Turning right");
            right++;
        }
        case 'U' -> {
            System.out.println("turning up");
            up++;
        }
        case 'D' -> {
            System.out.println("turning down");
            down++;
        }
    };
    }
}
