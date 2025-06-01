package chapt11;

public class ThreadsDemo {
    /*once a java program spins, 
     * there is the creation of a main thread, this thread can be controlled
     * by obtaining a reference to it through the currentThread() method of
     * type Thread Class
     */

     public static void main(String[] args) {

        Thread t = Thread.currentThread();

        System.out.println("current thread " + t);
     }
}
