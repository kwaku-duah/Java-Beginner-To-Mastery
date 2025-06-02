package chapt11;

public class MethodSynchronized {
    /*
     * putting a reference to a class in synchronized
     * 
     */
    void call(String msg) {
        System.out.print("[" + msg);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Caught exception " + e);
        }

        System.out.println("]");
    }
}


class DemoCaller implements Runnable {
    String msg;
    Thread t;
    MethodSynchronized target;

    DemoCaller(MethodSynchronized targ, String s) {
        msg = s;
        target = targ;
        t = new Thread(this);
    }

    public void run() {
        /* reference to the object being synchronized */
        synchronized (target) {
            target.call(msg);
        }
    }

}

class SynchDemo {
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
