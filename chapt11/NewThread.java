package chapt11;

public class NewThread extends Thread {

    /*creating a thread by extending a class */
    Thread t;
    
    NewThread(){
        super("Demo");
    }
    

    //override the run method
    public void run() {
        try {
            for (int i= 5; i > 0; i--) {
                System.out.println("Child threads " + i);
                Thread.sleep(500);
                System.out.println("Thread name: " + getName());

                
            }
        } catch(InterruptedException e) {
            System.out.println("Thread has been intercepted " + e);
        }
        System.out.println("Exiting child thread");
    }
}

class ExtendThreads{
    public static void main(String[] args) {
        NewThread nt = new NewThread();
        nt.start();

       try {
         for (int i = 5; i > 0; i--){
            System.out.println("Main thread " + i);
            Thread.sleep(1000);
        }
       } catch(InterruptedException e) {
        System.out.println("Main thread " + e);
       }
       System.out.println("Exiting main thread");
    }

}
