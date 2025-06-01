package chapt11;

public class MultiThreads implements Runnable {
    /*creating three threads */
    String name;
    Thread t;

    MultiThreads(String threadName) {
        name = threadName;
        t = new Thread(this, name);
    }

    //Entry point for the program
    public void run() {
        try{
            for (int i = 5; i > 0; i--) {
                System.out.println("Child thread " + i + " " + name);
                Thread.sleep(1000);
            }
        } catch(InterruptedException e){
            System.out.println("Child thread caught  error " + e);
        }
        System.out.println("Exiting child thread " + name);
    }

}

class VaryingThreads {
    public static void main(String[] args) {
        MultiThreads nt1 = new MultiThreads("thread1");
        MultiThreads nt2 = new MultiThreads("thread2");
        MultiThreads nt3 = new MultiThreads("thread3");

        nt1.t.start();
        nt2.t.start();
        nt3.t.start();

        /*threads created with start() are child threads and created
         * in the main thread are the main threads
         * 
         */

        try {
            // for (int i = 5; i > 0; i --){
            //     System.out.println("Main Thread " + i);
                Thread.sleep(10000);
            // }
        } catch(InterruptedException e) {
            System.out.println("caught error " + e);
        }
        System.out.println("Exiting main thread");
    }
}
