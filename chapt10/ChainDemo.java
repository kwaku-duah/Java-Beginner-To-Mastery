package chapt10;

public class ChainDemo {
    /*chained errors where one finds the cause and the second 
     * actually gets the cause
     */
static void demoproc(){

     NullPointerException e = new NullPointerException("top level");

     //creaing cause
     e.initCause(new ArithmeticException("cause"));

     throw e;
}

public static void main(String[] args) {
    try {
        demoproc();
    }catch(NullPointerException e) {
        System.out.println("caught " + e);

        System.out.println(e.getCause());
    }
}
}
