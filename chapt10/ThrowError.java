package chapt10;

public class ThrowError {
    /*throw error */
    static void demoproc() {
        try {
            throw new NullPointerException();

        } catch(NullPointerException e) {
            System.out.println("Held " + e);
            throw e;
        } 
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch(NullPointerException e) {
            System.out.println("Recaught it");
        }
    }
}
