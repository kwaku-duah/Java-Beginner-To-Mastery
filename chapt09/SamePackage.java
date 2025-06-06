package chapt09;

public class SamePackage {
    /*access levels through creation of an object of type another within
     * another file
     */

     SamePackage() {
        Protection pro = new Protection();

        //accessing the instance variables(package private)
        System.out.println(pro.n);

        //accessing private method within Protection.java file, barred
        // System.out.println(pro.n_pri);

        //accessing protected variable
        System.out.println(pro.n_pro);

        //accessing public variable
        System.out.println(pro.n_pub);
     }
}
