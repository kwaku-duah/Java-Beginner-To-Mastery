package chapt09;

public abstract class Incomplete implements Callback {
    /*if a class implements an interface and fails to implement fully all 
     * methods, that class should be declared abstract
     */

     void show(){
        System.out.println("Not gonna implement the method required");
     }
}
