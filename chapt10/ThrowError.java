package chapt10;

public class ThrowError {
    /*throw error */
    static void demoproc() {
        try {
            throw new NullPointerException("Points to nothing");

        } catch(NullPointerException e) {
            String msg = e.getMessage();
            System.out.println(msg);
        } 
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch(NullPointerException e) {
            e.getMessage();
        }
    }
}
