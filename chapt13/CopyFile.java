package chapt13;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    /*demonstrating use of write method to write to a file
     * void write(int var) throws IOException
     */

     public static void main(String[] args) {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        //checking to see if both arguments exists before proceeding 
        if (args.length !=2 ) {
            System.out.println("Usage: specify a file and where it is to be copied to");
            return;
        }

        //if it reaches here, definitely fine would be read from and written to
        try {
            //attempt to open the files
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);


            do {
                i = fin.read();
              
                if (i != -1) fout.write( i);
                
            } while ( i != -1);
        } catch (IOException e) {
            System.out.println("I/O error");
        } finally {
            try {
                if (fin != null) fin.close();
            } catch (IOException e) {
                System.out.println("File could not be closed");
            }

            try {
                if (fout !=null) fout.close();

            }catch(IOException e) {
                System.out.println("I/0 for writing");
            }
        }
        } 
     }
/* EOF IS -1 */
