package chapt09;

public class Derived extends Protection {
    /* protection is within same package and is public so this can access it*/
    Derived() {
        System.out.println(n);

        // System.out.println(n_pri); only accessible class level

        System.out.println(n_pro);

        System.err.println(n_pub);
    }
}
