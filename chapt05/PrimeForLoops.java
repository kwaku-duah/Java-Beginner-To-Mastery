package chapt05;

public class PrimeForLoops {
    /* demonstrate prime numbers within 100 */
   public static void main(String[] args) {
    int num;
    boolean isPrime;

    num = 14;

    for( int i = 2; i <= num/i; i++) {
        if ((num % i) == 0) {
            isPrime = false;
            break;
        } else isPrime = true;
        System.out.println(isPrime);
    }



   }
   

}
