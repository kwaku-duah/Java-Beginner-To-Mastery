package chapt10;

public class Exception1 {
    /*exceptions by java's default exception handler */
    static void subroutine(){
        int a = 0;
        int d= 10 / a;
    }
    public static void main(String[] args) {
        Exception1.subroutine();
    }
}
