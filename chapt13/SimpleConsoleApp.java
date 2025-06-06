package chapt13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleConsoleApp {
    public static void main(String[] args) throws IOException {

        /*read method throws an IOException
         * creates an object of type BufferedReader that wraps InputStreamer to convert
         * from bytestream with character stream then takes q to quit
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, System.console().charset()));

        System.out.println("Enter characters, 'q' to quit program");
        char c;
         do {
            c = (char) br.read();
         } while (c != 'q');
    }


}
