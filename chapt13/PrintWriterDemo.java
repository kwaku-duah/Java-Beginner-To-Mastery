package chapt13;

import java.io.*;

public class PrintWriterDemo {
    /*character based approach for outputting to the console
     * modern way, takes the form 
     * PrintWriter(OutputStream var, boolean flushingOn)
     * PrintWrite is a class and flushingON being TRUE
     * means - output immediately and false being otherwise
     * Although system.out is an accepted way of writing to the console,
     * PrintWriter is the accepted of doing such, it is internationalize
     */
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);

        pw.println("This is a string");

        int i = -7;
        pw.println(i);
         
        double d = 4.5e-7;
      
        pw.println(d);

    }

}
