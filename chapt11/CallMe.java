package chapt11;

public class CallMe {
    /* demonstration need for synchronization
     * simply two or more parts of a program wanting to access shared resource
     * implementation done regarding this uses an object which acts as a monitor
     * once a thread acquires the lock of the monitor, all other threads
     * would have to wait for it to exit 
    */
    void  call(String msg){
        System.out.println("[" + msg);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Caught exception " + e);
        }

        System.out.println("]");
    }
}

class Caller implements Runnable {
    String msg;
    CallMe target;
    Thread t;

    Caller(CallMe targ, String s){
        msg = s;
        target = targ;
        t = new Thread(this);

    }
    
    public void run(){
        target.call(msg);
    }
}


class Synch {
  public static void main(String[] args) {
      CallMe target = new CallMe();

    Caller ob1 = new Caller(target, "Hello");
    Caller ob2 = new Caller(target, "World");
    Caller ob3 = new Caller(target, "Unsynchronized");

    //start the threads
    ob1.t.start();
    ob2.t.start();
    ob3.t.start();

    //stop the threads
    try {
        ob1.t.join();
        ob2.t.join();
        ob3.t.join();
    } catch (InterruptedException e) {
        System.out.println("System interrupted " + e);
    }

  }
}

