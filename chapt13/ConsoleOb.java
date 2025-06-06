package chapt13;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleOb {
    public static void main(String[] args) {
        /*
         * reference to a
         * console object can be obtained by calling System.console()
         * if it returns null, means there is no console
         */
        try {

            Console con = System.console();
            if (con == null)
                return;

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in, System.console().charset()));
            System.out.println("returns something " + br.read());
        } catch (IOException e) {
            System.out.println("Caught Error");
        }
    }
}
