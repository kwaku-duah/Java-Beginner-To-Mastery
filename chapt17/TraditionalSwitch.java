package chapt17;


/*
 * using the traditional switch statement
 */
public class TraditionalSwitch {
    public static void main(String[] args) {
        int priorityLevel;

        int eventCode = 6010;

        //traditional switch statement 
        switch (eventCode) {
            case 1000:
            case 1200:
            case 8900:
                priorityLevel = 1;
                break;
            case 2000:
            case 6010:
            case 9128:
                priorityLevel = 2;
                break;
            case 1002:
            case 7023:
            case 9300:
                priorityLevel = 3;
                break;
            default:
                priorityLevel = 0;
        }
        System.out.println("The event code is " + eventCode + " with a priority level of " + priorityLevel);
    }
}
