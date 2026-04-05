public class References_Example {
    public static void main(String[] args) {
        ThreadLocal<Long> userIdThreadLocal = new ThreadLocal<>();

        // Simulate user landing on the webpage
        Long userid = 1789L;
        Long userid1 = 2345L;

        // Handle the thread in new thread
        Thread thread1 = new Thread(() -> {
            System.out.println("Started thread for user:" + userid);
            userIdThreadLocal.set(userid);
            // Process logic
            // DataBaseCall
            System.out.println("Completed logic for:" + userIdThreadLocal.get());
            userIdThreadLocal.remove();
            System.out.println("Thread Local is removed for:" + userIdThreadLocal.get());
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("Started thread for user:" + userid1);
            userIdThreadLocal.set(userid1);
            // Process logic
            // DataBaseCall
            System.out.println("Completed logic for:" + userIdThreadLocal.get());
            userIdThreadLocal.remove();
            System.out.println("Thread Local is removed for:" + userid1);
        });

        thread1.start();
        thread2.start();

        InheritableThreadLocal<String> inheritableThreadLocal = new InheritableThreadLocal<>();

        Thread thread3 = new Thread(() -> {
            inheritableThreadLocal.set("instagram");
            userIdThreadLocal.set(userid);
            Thread thread4 = new Thread(() -> {
                // Parent thread variable can be accessed by child thread
                System.out.println("Child Thread: " + inheritableThreadLocal.get());
                System.out.println("Child Thread: " + userIdThreadLocal.get());
            });
            thread4.start();
            System.out.println("Parent Thread: " + inheritableThreadLocal.get());
        });

        thread3.start();

    }
}
