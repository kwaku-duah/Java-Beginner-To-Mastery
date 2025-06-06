package chapt09_1;


public class Protection2 extends chapt09.Protection {
    
    Protection2(){
        System.out.println("Derived other constructors");

        //package private (not visible)
        // System.out.println("accessing package private " + n);

        //accessing private field from another package
        // System.out.println("private field in another package" + n_pri);

        //accessing the protected field in the other package
        System.out.println(n_pro); //this field is accessible because it is protected

        //accessing public field
        System.out.println(n_pub);


    }

    
}
