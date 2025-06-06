package chapt12;

public class Unboxing {
    /*because of auto-unboxing, Integer can be used to control a switch statement */
    public static void main(String[] args) {
        Integer iOB = 2;
        //auto-unboxing will get iOB to strip to be 2, get used and get boxed back

        switch (iOB) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("error");
                break;
        }
    }
}
