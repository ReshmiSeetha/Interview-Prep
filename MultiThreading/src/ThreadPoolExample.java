import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExample {
    public static void main(String[] args) {
        // single thread executor
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        System.out.println("Single Thread Executor:");
        for (int i = 0; i <= 5; i++) {
            final int taskId = i;
            singleThreadExecutor.execute(() -> {
                System.out
                        .println("Single Thread Task " + taskId + " executed by " +
                                Thread.currentThread().getName());
            });

        }
        singleThreadExecutor.shutdown();

        // Fixed Thread Executor
        ExecutorService fixedThreadExecutor = Executors.newFixedThreadPool(3);
        System.out.println("Fixed Thread Executor:");
        for (int i = 0; i <= 5; i++) {
            final int taskId = i;
            fixedThreadExecutor.execute(() -> {
                System.out.println("Fixed Thread Task " + taskId + " executed by " +
                        Thread.currentThread().getName());
            });
        }
        fixedThreadExecutor.shutdown();

        // Cached thread Pool
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        System.out.println("Cached Thread Pool:");
        for (int i = 0; i <= 5; i++) {
            final int taskId = i;
            cachedThreadPool.execute(() -> {
                System.out
                        .println("Cached Thread Task " + taskId + " executed by " +
                                Thread.currentThread().getName());
            });
        }
        cachedThreadPool.shutdown();

        // Scheduled Thread Pool
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(3);
        System.out.println("Scheduled Thread Pool:");
        for (int i = 0; i <= 5; i++) {
            final int taskId = i;
            scheduledThreadPool.schedule(() -> {
                System.out.println(
                        "Scheduled Thread Task " + taskId + " executed by " +
                                Thread.currentThread().getName());
            }, 3, TimeUnit.SECONDS);
        }
        scheduledThreadPool.shutdown();

        // Thread Pool Executor
        ExecutorService threadPoolExecutor = new ThreadPoolExecutor(1, 5, 0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<>(2));

        for (int i = 0; i < 5; i++) {
            final int taskId = i;
            threadPoolExecutor.execute(() -> {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread Pool Task " + taskId + " executed by " + Thread.currentThread().getName());
            });
        }
        threadPoolExecutor.shutdown();
        threadPoolExecutor.close();
    }
}
