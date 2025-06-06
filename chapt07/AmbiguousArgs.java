package chapt07;

public class AmbiguousArgs {
    /*ambiguity can arise from overloading with varargs in methods */

    static void vaTest(int ... vals) {
        for (int x:vals) {
            System.out.print(x + " ");
            System.out.println();
        }
    }
    static void vaTest(boolean ... two){
        for (boolean x:two){
            System.out.print(x + "");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        vaTest(1 == 'a', 03==13);
        vaTest(1,2,3,4,4,6);

        //ambiguous method
        // vaTest();
    }
}
