package taskscheduler;

public class Task {
    /*creating a task that implements the Runnable interface */
    private String nameOfTask;
    private TaskType task;

    //constructor method
    public Task(String name, TaskType t) {
        this.nameOfTask = name;
        this.task = t;
    }

    //Runnable interface have an implicit method run(), overriding it
    public void run() {
        System.out.println("Executing " + task + "task: "  + nameOfTask + " at" + System.currentTimeMillis());
    }
}
