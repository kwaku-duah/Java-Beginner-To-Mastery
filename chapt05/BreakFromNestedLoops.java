package chapt05;

public class BreakFromNestedLoops {
    /* demonstration of breaking from loops */
    public static void main(String[] args) {
        
        outer: for(int i = 0; i < 3; i++){
            System.out.println("values for i " + i + " : " );
            for (int j = 0; j < 100; j++) {
                if ( j == 10) break outer; //this effectively exits both loops
                System.out.println("j " + j);
            }
            System.out.println("this will not print");
        }
        System.out.println("this will print");
    }
}
