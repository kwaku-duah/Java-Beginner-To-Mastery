package chapt09;

import chapt09_1.*;

public class TestBalance {
    /*we can import the class we just created and use */

   public static void main(String[] args) {
    //created an object with a class from chapt09
    CreateBalance test = new CreateBalance("Kwaku Duah, General", 34.99);

    //calling a method from the package
    test.show();
   }
}
