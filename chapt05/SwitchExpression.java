package chapt05;

public class SwitchExpression {
    /* demonstrating how switch expression works in java */
    public static void main(String[] args) {
        int i;

        for(i = 0; i < 6; i++)
            switch(i) {
                case 0:
                    System.out.println("i is zero ");
                    break;
                case 1:
                    System.out.println("i is 1 ");
                    break;
                case 2:
                    System.out.println("i is 2");
                    break;
                case 3:
                    System.out.println("i is 3 ");
                    break;
                default:
                    System.out.println("i is greater than 3");
            }
    }
}
