package chapt13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadDemo {
    /*used read method to read from a file with fileinputsteam
     * this file showcases the use of manually calling close() method
     * 
     */
    public static void main(String[] args) {
        int i;
        FileInputStream fin;

        //first confirm an argument is specified the commandline
        if(args.length != 1) 
        {System.out.println("No file has been specified");
        return;
}
        //attempt to open the file
        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("No such file exists");
            return;
        }

        //if code reaches here it means the file is open and can be read
        try {
            do {
                i = fin.read() ;
                if (i != -1) System.out.println((char) i);
            } while (i != 1);
        } catch (IOException e) {
            System.out.println("File cannot be opened");
        }

        try {
            fin.close();
        } catch (IOException e) {
            System.out.println("File failed to close");
        }

    }
}
