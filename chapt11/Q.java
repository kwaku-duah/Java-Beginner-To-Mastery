package chapt11;

public class Q {
    /*implementing producer/consumer context in java, that has not being implemented
    correctly
     */

     //implementing it rightly
     int n;
     boolean valueSet = false;

     synchronized int get(){

        while(!valueSet) {
            try{
                wait();
            }catch(InterruptedException e) {
                System.out.println("Caught Exception");
            }
        }
        System.out.println("Gotten " + n);
        valueSet = false;
        notify();
        return n;
     }

     synchronized void put(int n){

        while (valueSet){
            try{
                wait();
            } catch(InterruptedException e){
                System.out.println("Interrupted exception caught " + e);
            }
        }
        
        this.n = n;
        valueSet = true;
        System.out.println("put " + n);
        notify();
     }

}

//producer class
class Producer implements Runnable{
    Q q;
    Thread t;
    
    Producer(Q q){
        this.q = q;
        t = new Thread(this, "Producer");
    }

    //implement the run method
    public void run() {
        int i = 0;

        while(true){
            q.put(i++);
        }
    }
}

//implementing Consumable
class Consumer implements Runnable{
    Q q;
    Thread t;

    Consumer(Q q){
        this.q = q;
        t = new Thread(this, "Consumer");
    }

    public void run(){
        while(true){
            q.get();
        }
    }
}

class PC {
    public static void main(String[] args) {
        Q q = new Q();
        
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);

        p.t.start();
        c.t.start();

        System.out.println("Press Ctrl-C to stop");

    }
}