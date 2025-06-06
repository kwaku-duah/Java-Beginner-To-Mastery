package taskscheduler;

public class TaskRunner {
    /* Implements threading with delay before executing the task */
    public static void runTask(Task t, int delayInMilli) {

        try {
            Thread.sleep(delayInMilli);
            t.run();
        } catch (InterruptedException e) {
            System.out.println("Interrupted "  + e);
        }
        Thread threadDefined = new Thread(t); //constructor in Runnable that a Runnable task
        threadDefined.start(); 
    }

}
