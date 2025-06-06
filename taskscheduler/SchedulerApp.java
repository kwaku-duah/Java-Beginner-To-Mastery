package taskscheduler;

public class SchedulerApp {
    public static void main(String[] args) {
        Task task1  = new Task("BackUpDocuments", TaskType.BACKUP);
        Task task2 = new Task("DownloadDocuments", TaskType.DOWNLOAD);
        Task task3 = new Task("SYNC TASKS",TaskType.SYNC);

        TaskRunner.runTask(task1, 1000);
        TaskRunner.runTask(task2, 3000);
        TaskRunner.runTask(task3, 000);

        System.out.println("Scheduled tasks..");
    }
}
