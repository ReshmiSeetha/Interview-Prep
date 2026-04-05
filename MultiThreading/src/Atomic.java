import java.util.concurrent.atomic.AtomicInteger;

class SharedCounter {

    // private int count;

    private AtomicInteger count = new AtomicInteger(0);

    public void increment() {
        count.incrementAndGet(); // count ++
    }

    public int getCount() {
        return count.get();
    }
}

public class Atomic {

    public static void main(String[] args) {
        SharedCounter sharedCounter = new SharedCounter();

        Thread thread1 = new Thread(() -> {
            System.out.println("Thread1 Started");
            for (int i = 0; i < 5000; i++) {
                sharedCounter.increment();
            }
            System.out.println("Thread1 Finished");
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("Thread2 Started");
            for (int i = 0; i < 5000; i++) {
                sharedCounter.increment();
            }
            System.out.println("Thread2 Finished");
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + sharedCounter.getCount());

    }
}
