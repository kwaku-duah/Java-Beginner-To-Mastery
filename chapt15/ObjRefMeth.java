package chapt15;

/*demonstrate a method reference to an instance
 * 
 */

interface StringFunc {
    String func(String str);
}

//instance method that defines reverse
class MyStringOps {
    String reverse(String st) {
        String rev  = "";
        int i;

        for (i = st.length() -1; i >=0; i--)
            rev += st.charAt(i);
        return rev;
    }
}

public class ObjRefMeth {
    //method that takes a functional interface as a parameter
    static String myStat(StringFunc str, String s) {
        return str.func(s);
    }

    public static void main(String[] args) {
        String instr = "Lambda expressions are very powerful";
        String outr;

        MyStringOps instan = new MyStringOps();

        //an instance of that class
        outr = myStat(instan::reverse, instr);
    }
}
