package chapt12;

public class Autobox {
    public static void main(String[] args) {
    /*Modern Java now incorporates automatic boxing and automatic unboxing in the
     * language 
     * the process by which a primitive data type is encapsulated into its 
     * equivalent type wrapper class automatically is called AUTOBOXING
     * whereas auto-unboxing refers to extraction of a value from a boxed object of type
     * wrapper class, automatically is called auto-unboxing
     */

     Integer iOB = 100; //autoboxing, value assigned to a reference of a wrapper class

     int i = iOB;
     //auto-unboxing of a boxed object

     System.out.println(i + " " + iOB);
    }

     
}
