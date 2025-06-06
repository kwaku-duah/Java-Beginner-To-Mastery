package taskscheduler;

public class Task implements Runnable {
    /*creating a task that implements the Runnable interface */
    private String nameOfTask;
    private TaskType task;

    //constructor method
    public Task(String name, TaskType t) {
        this.nameOfTask = name;
        this.task = t;
    }

    //Runnable interface have an implicit method run(), overriding it
    @Override //annotation to override the run method
    public void run() {
        System.out.println("Executing " + task + "task: "  + nameOfTask + " at" + System.currentTimeMillis());
    }
}
