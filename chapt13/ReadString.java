package chapt13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadString {
    /*reading strings in java using readLine() method
     *
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in,System.console().charset()));

        String str;

        do {
            str = br.readLine(); //reading strings in java
            System.out.println("Enter words ");
            System.out.println("Enter 'stop' to end program");
        } while(!str.equals("stop"));
    }
}
