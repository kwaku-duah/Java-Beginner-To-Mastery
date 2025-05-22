package chapt07;

public class OverloadArgs {
    /*overloading a variable vargs method is allowed */

    static void vaTest(int ... vals){

        for (int x:vals) {
            System.out.print(x + "");
            System.out.println();
        }
    }

    static void vaTest(boolean ... two) {

        for (boolean x: two) {
            System.out.print(x + " ");
            System.out.println();
        }
    }

    static void vaTest(String ... three) {
        for (String x: three) {
            System.out.print(x + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        vaTest(2, 3, 4);
        vaTest("message1", "message2");
        vaTest(49== 'A');
    }
}
