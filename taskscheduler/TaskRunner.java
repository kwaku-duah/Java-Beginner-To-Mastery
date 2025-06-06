package taskscheduler;

public class TaskRunner {
    /*implementing threading for the tasks and name of tasks */
    public static void runTask(Task t, int delayInMilli){

        try {
            Thread.sleep(delayInMilli);
            t.run();
            
        } catch (InterruptedException e) {
            System.out.println("Method handled " + e);
        }
    }
}
