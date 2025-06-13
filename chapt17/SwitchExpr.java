package chapt17;

/*
 * switch statement in the new additions now uses switch expression with yield
 * that can return a value, it returns a value and acts as a break statement altogether
 */

public class SwitchExpr {
    public static void main(String[] args) {
        //value is assigned to priorityLevel and notice how the yield statement
        //returns and breaks the same time
        int eventCode = 6010;
        int priorityLevel = switch(eventCode) {
            case 1000, 1200, 8900:
                yield 1;
            case 6010, 3400, 5557:
                yield 2;
            default:
                yield 0;
        };
        System.out.println("eventcode is  " + eventCode  + " with priorityLevel " + priorityLevel);
    }
}
