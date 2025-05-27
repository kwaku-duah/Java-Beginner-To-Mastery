package chapt08;

public class PreventOverriding {
    /*final keyword can be used to prevent method overriding */

    final void meth(){
        System.out.println("Prevent method overriding");
    }
}

class TryOverride extends PreventOverriding {

    // void meth(){
    //     System.out.println("This is illegal, a final method cannot be overridden");
    // }
    
}
