package chapt11;

public class CreateThread implements Runnable {
    /*there are majorly two ways to create a thread
     * implement the Runnable interface
     * or extend the thread class
     */
    Thread t;

    CreateThread() {
        t = new Thread(this, "ThisThread");
        System.out.println("details about thread" + t);
    }

    public void run() {
        //todo implementation
    }

    public static void main(String[] args) {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Threads " + i);
                Thread.sleep(500);
            }
        } catch(InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("exiting child thread");
    }
}
