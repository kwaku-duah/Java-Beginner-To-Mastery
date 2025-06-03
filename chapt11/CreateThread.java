package chapt11;

public class CreateThread implements Runnable {
    /*
     * there are majorly two ways to create a thread
     * implement the Runnable interface
     * or extend the thread class
     */
    Thread t;

    CreateThread() {
        t = new Thread(this, "ChildThread");
        System.out.println("details about child thread" + t);
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Threads " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("exiting child thread");
    }

    // demonstration of two parts of a program using concurrent threads
    public static CreateThread FactoryMethod() {
        /*
         * a factory method can be used to create a thread, and start it
         * then return a reference to the object all in one method
         */

        CreateThread thrd = new CreateThread();
        thrd.t.start();
        return thrd;
    }

}

class DemoThread {
    public static void main(String[] args) {
        // CreateThread nt = new CreateThread();

        // nt.t.start(); // made an instance of our custom thread and started it

        //demonstrating use of factory method by commenting out the two lines
        CreateThread nt = CreateThread.FactoryMethod();

        /*
         * 
         */

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main thread " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Exit main thread");
    }
}
