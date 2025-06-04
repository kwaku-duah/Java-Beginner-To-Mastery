package chapt12;

import java.lang.annotation.Retention;

public class RetentionPolicy {
    /*Retention policy in java indicates when an annotation should be discarded
     * it has three values in an enum in java.lang.annotation.RetentionPolicy
     * SOURCE - only retained in the source and discarded
     * CLASS - only remains in the .class file and not available to the JVM
     * RUNTIME - remains in the .class file and available to JVM  - thus runtime
     * policy offers the greatest annotation persistence in java
     * if no retention policy is specified, it defaults to CLASS
     * precedes annotation creation
     * SOURCE for 
     */
    @Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @interface MyAnnot {
        String str();
        int val();
    }


}
