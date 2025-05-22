package chapt07;

public class LocalVarInference {
    /*local variable inference shortens code
     * streamlines code and the java compiler infers from the type of the 
     * initializer
     */
    private int i;

    LocalVarInference(int k) {
        i = k;
    }

    //set the  i
    void seti(int k){
        if (k >= 0) i = k;
    }

    int geti() {
        return i;
    }
}

class TestLocal{
    public static void main(String[] args) {
        //supposed to call the class but var can be used to streamline
        var  mc = new LocalVarInference(10);
        System.out.println(mc.geti());

        mc.seti(25);
        System.out.println(mc.geti());
    }
}
