package chapt13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DuplicateFile {
    /*use try-with-resources to manage multiple resources
     * the try can take multiple statements
     */
    public static void main(String[] args) {
        int i;

        //check to see if the field have a target and destination field
        if (args.length !=2) {
            System.out.println("usage: takes two files, first target file and second is destination file");
            return;
        }

        //try-with-resources that takes multiple statements
        try(FileInputStream fin = new FileInputStream(args[0]);
            FileOutputStream fout = new FileOutputStream(args[1])) {
            
                do {
                    i = fin.read();
                    if (i != -1) fout.write(i);
                } while (i != -1);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("I/O exception");
        }
    }
}
