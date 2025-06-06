package chapt09_1;

import chapt09.Protection;

public class OtherPackage {
    /*making an object with of a type from another package
     * 
     */

     OtherPackage() {
        chapt09.Protection prot = new chapt09.Protection();
        System.out.println("Other package constructor");

        //accessing package private variable
        // System.out.println(prot.n); not visible

        //accessing private field
    //     System.out.println(prot.n_pri); not visible

    //accessing protected field
    // System.out.println(prot.n_pro); not visible

    //acacessing a public field
    System.out.println(prot.n_pub);
     }
}
