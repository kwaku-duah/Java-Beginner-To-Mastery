package chapt11;

public class StateThread implements Runnable {
    /*doing suspend, stop and resume the modern way */
    String name;
    Thread t;
    boolean suspendFlag;

    StateThread(String n){
        name = n;
        t = new Thread(this, name);
        System.out.println("New Thread " + name);
        suspendFlag = false;
    }

    public void run() {
        try {
            for (int i = 15; i > 0; i--){
                System.out.println(name + ": " + i);
                Thread.sleep(200);
                
                synchronized(this) {
                    while (suspendFlag){
                        wait();
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(name + "Interrupted");
        }
        System.out.println(name + "exiting thread");
    }
    synchronized void mysuspend() {
        suspendFlag = true;
    }
    synchronized void resume(){
        suspendFlag = false;
        notify();
    }
}

class SuspendResume {
    public static void main(String[] args) {
        StateThread ob1 = new StateThread("ob1");
        StateThread ob2 = new StateThread("ob2");

        ob1.t.start();
        ob2.t.start();

        try{
            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("Suspending thread 1");
            Thread.sleep(1000);
            ob1.resume();
            System.out.println("Resuming thread one");

            ob2.mysuspend();
          
            System.out.println("Suspending thread 2");
              Thread.sleep(1000);
            ob2.resume();
            System.out.println("Resuming thread 2");

        } catch(InterruptedException e) {
            System.out.println("Main thread interrupted ");
        }

        //wait for threads to finish
        try{
            System.out.println("Waiting for threads to finish");
            ob1.t.join();
            ob2.t.join();

        } catch(InterruptedException e)  {
            System.out.println("Main thread interrupted ");
        }
        System.out.println("Exiting main thread");
    }
}