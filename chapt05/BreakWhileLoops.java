package chapt05;

public class BreakWhileLoops {
    /* demonstrate usage of while loops getting terminated */
    public static void main(String[] args) {
        int i = 0;

        while(i < 10){
            if ( i == 5) break;
            System.out.println("values of " + i);
            i++;
        }
    }
}
