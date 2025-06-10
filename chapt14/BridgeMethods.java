package chapt14;


class Genoe<T> {
    T ob;

    Genoe(T o) { ob = o;}

    T getOb() {
        return ob;
    }
}

class SubGenoe extends Genoe<String> {

    SubGenoe(String o) {
        super(o);
    }

    //a string specific override of getOb
    String getOb() {
        System.out.println("YOu called string getOb ");
        return ob;
    }
}

public class BridgeMethods {
    /*bridge methods occur at bytecode level
     * when type of erasure of a subclass is different from the type of erasure 
     * of its superclass, a bridge method is created that keeps the erasure of the superclass
     * and calls the erasure of the subclass
     * type erasure is the mechanism underhood that makes java work, there are no type 
     * parameters during runtime, they are all converted to its bounded type Objects and casts
     * and type args specified are applied
     * 
     * 
     */
    public static void main(String[] args) {
        SubGenoe mc  = new SubGenoe("Testing");

        System.out.println(mc.getOb());
    }

}
