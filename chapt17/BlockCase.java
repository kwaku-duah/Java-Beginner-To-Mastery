package chapt17;

/*
 * block case expression
 */

public class BlockCase {
    /*
     * this arrow case using -> and block code, for this one it makes 
     * use of yield 
     */
    public static void main(String[] args) {
        boolean stopNow;

        int eventCode = 9300;

        int priorityLevel = switch(eventCode) {
            case 1000, 2300, 8900 -> {
                stopNow = false;
                System.out.println("Alert");
                yield 1; 
            }
            case 3400, 3600, 7888 -> {
                stopNow = true;
                System.out.println("Warning");
                yield 2; 
            }
            default -> {
                stopNow = false;
                System.out.println("Normal");
                yield 0; 
            }         
        };
        System.out.println("event code is " + eventCode + " priorityLevel " + priorityLevel);
    }
}
