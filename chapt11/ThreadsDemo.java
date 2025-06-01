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
        
        //changing name for thread
        t.setName("My Thread");
        System.out.println("After name change " + t);

        try {
            for (int n = 5; n > 0; n--){
                System.out.println("Current value of n " + n);
                Thread.sleep(1000);
            } 
        } catch(InterruptedException e) {
                System.out.println("Main Thread interrupted");
            }

     }


}
