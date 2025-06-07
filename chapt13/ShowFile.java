package chapt13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
    /*Automatically closing a resource after usage has been implemented by 
     * Java, using the try-with-resources statement
     * of the format 
     * try(resource-specification) {
     * //resource usage
     * }
     * 
     * this works with all resources that implements autocloseable interface
     * all the streams implement the autocloseable
     */
    public static void main(String[] args) {
        int i;

        //check to see if file exists
        if (args.length != 1) {
            System.out.println("No file submitted ");
            return;
        }

        //try with resource statement usage
        try(FileInputStream fin = new FileInputStream(args[0])) {
            do {
                i = fin.read(); 
                if (i != -1) System.out.println((char) i);
            } while( i != -1);
        } catch (FileNotFoundException e) {
            System.out.println("File Cannot be found " + e);
        } catch (IOException e) {
            System.out.println("I/O exception");
        }
    }
}
