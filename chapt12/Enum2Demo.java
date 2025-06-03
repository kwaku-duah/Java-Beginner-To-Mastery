package chapt12;


/* values method and valueOf method
 * values method returns an array of all enumeration constants and ValueOf(String str) 
 * method return the value of the string in the enumeration
 */
enum Apple {
    Jonathan, Golddel, Reddel, Winesap, Cortland
}

public class Enum2Demo {
    public static void main(String[] args) {
        Apple ap;

        //values() returns arrays
        /* enum has features as a class
         * but because it is static, it can be called independently, it does not require NEW Keyword
         * to instantiate
         */
        Apple[] allapples = Apple.values();
        for (Apple allapple: allapples) System.out.println(allapple);

        //valueOf method returns a string
        ap = Apple.valueOf("Winesap");
        

        System.out.println("ap contains " + ap);
    }
}
