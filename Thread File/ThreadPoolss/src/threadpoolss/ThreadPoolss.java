package threadpoolss;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolss {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(4);

        for (int i = 1; i <= 10; i++) {
            Runnable task = new Task(i);
            executor.submit(task);
        }

        executor.shutdown();

    }

}
