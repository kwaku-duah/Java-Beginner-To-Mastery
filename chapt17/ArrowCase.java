package chapt17;

/*
 * the arrow case makes the switch expression very efficient
 * goes with the -> which returns a value and acts as a break same time
 */

public class ArrowCase {
    public static void main(String[] args) {
        int eventCode = 6020;

        int priorityLevel = switch(eventCode) {
            case 1000, 1200, 8910 -> 1;
            case 6010, 4567, 4587 -> 2;
            default -> 0;
        };
        System.out.println("event code is " + eventCode + " and priorityLevel "  + priorityLevel);
    }
}
