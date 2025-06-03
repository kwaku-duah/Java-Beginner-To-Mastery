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
        Apple[] allapples = Apple.values();
        for (Apple allapple: allapples) System.out.println(allapple);

        
    }
}
