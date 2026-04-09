
//import java.net.http.HttpClient;
import java.util.List;
import java.util.ArrayList;

public class PlatformThreadsExample {

    // private static HttpClient httpClient = HttpClient.newHttpClient();

    public static void main(String[] args) throws InterruptedException {
        // To check after how many number of thread creation the platform thread will
        // give error
        final int threadCount = 10_000;
        List<Thread> threads = new ArrayList<>();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Simulate fetching data");
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Data fetched from API");
            }
        };

        for (int i = 0; i < threadCount; i++) {
            // Thread thread = new Thread(runnable);
            Thread thread = Thread.ofVirtual().unstarted(runnable);
            thread.setDaemon(true);
            thread.setName("PlatformThread-" + i);
            thread.start();
            String str = String.format("Thread Number is %s", i);
            System.out.println(str);
            threads.add(thread);
        }

        for (Thread thread : threads) {
            thread.join();
        }
    }
}
