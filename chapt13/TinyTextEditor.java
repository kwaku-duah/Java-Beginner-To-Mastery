package chapt13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TinyTextEditor {
    /* create a tiny text editor with Java */
    public static void main(String[] args) throws IOException {
        // Create a bufferedreader with system.in
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in, System.console().charset()));

        String[] str = new String[100];
        
        System.out.println("Enter lines of text ");
        System.out.println("Enter 'stop' to quit the program ");

        for (int i = 0; i < 100; i++) {
            str[i] = br.readLine();
          if(str[i].equals("stop")) 
            break;
          
        }

        //Displaying the entered liens

        for (int i =0; i<100; i++)   System.out.println(str[i]);

    }
}
