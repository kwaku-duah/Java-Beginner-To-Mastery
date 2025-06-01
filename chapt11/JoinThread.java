package chapt11;

public class JoinThread implements Runnable {
    /*two methods are used to precisely determine whether a thread is done
     * or not
     * isAlive() method which checks where the the thread it is called on has
     * finished or not - it gives a true or false otherwise
     * 
     * 
     * there is also join() method which frequently used
     * it waits until the thread it called upon terminates
     */
    String name;
    Thread t;

    JoinThread(String threadName) {
        name = threadName;
        t = new Thread(this, name);
    }

    //override the run
    public void run() {
        try {
            for (int i = 5; i > 0; i--){
                System.out.println(name + " Child thread " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Caught error " + e);
        }
        System.out.println("Exiting child thread");
    }
}

class CheckThreads {
    public static void main(String[] args) {
        JoinThread nt1 = new JoinThread("1");
        JoinThread nt2 = new JoinThread("2");
        JoinThread nt3 = new JoinThread("3");

        //ceating child threads
        nt1.t.start();
        nt2.t.start();
        nt3.t.start();

        System.out.println("is thread1 alive 1 " + nt1.t.isAlive());
        System.out.println("is thread2 alive 2 " + nt2.t.isAlive());
        System.out.println("is thread3 alive 3 " + nt3.t.isAlive());

        //implemnting join to wait for threads to finish
        try {
            nt1.t.join();
            nt2.t.join();
            nt3.t.join();
        } catch(InterruptedException e) {
            System.out.println("Caught Error " + e);
        }

        System.out.println("is thread1 alive " + nt1.t.isAlive());
        System.out.println("is thread2 alive " + nt2.t.isAlive());
        System.out.println("is thread3 alive " + nt3.t.isAlive());

        System.out.println("Exiting main thread");
    }
}