package chapt05;

public class ContinueWithLabels {
    /*using continue with label */
    public static void main(String[] args) {
        outer: for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                if (j > i) {
                    System.out.println();
                    continue outer; //terminates the j loop 
                }
                System.out.print((" " + i*j));
            }
            System.out.println();
        }
    }
}
