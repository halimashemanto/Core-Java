package threadpoolss;

public class Task implements Runnable {

    private int taskId;

    public Task() {
    }

    public Task(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {

        System.out.println("Task " + taskId + " is running on thread " + Thread.currentThread().getName());
        try {

            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Task " + taskId + " was interrupted");
        }
        System.out.println("Task " + taskId + " completed by " + Thread.currentThread().getName());
    }

}
