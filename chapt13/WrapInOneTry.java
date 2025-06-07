package chapt13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class WrapInOneTry {
    /*used read method to read from a file with fileinputsteam
     * this file showcases the use of manually calling close() method
     * 
     */
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null; //initiated to null

        //First check to see if filename has been specified
        if(args.length != 1 ) {
            System.out.println("Usage: no file specified");
            return;
        }

        //wrapping whole 
        try {
           fin = new FileInputStream(args[0]);
            do {
                 i = fin.read();
                 if (i != -1) {
                    System.out.println((char) i);

                 
            }} while (i != -1);
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        } catch (IOException e) {
            System.out.println("I/0 exception");
        } finally {
            try {
                if (fin != null) fin.close();
            } catch (IOException e) {
                System.out.println("I/0 closure failed");
            }
        }

    }
}
