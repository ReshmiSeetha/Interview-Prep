class SharedResource {
    // private volatile boolean flag = false;

    private boolean flag = false;

    public synchronized boolean isFlag() {
        return flag;
    }

    public synchronized void setFlag(boolean flag) {
        this.flag = flag;
    }
}

public class VolatileExample {

    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        // Thread 1

        Thread thread1 = new Thread(() -> {
            System.out.println("Thread 1 started");
            try {
                System.out.println("Thread 1 logic started");
                Thread.sleep(2000);
                System.out.println("Thread 1 logic finished");
                sharedResource.setFlag(true);
                System.out.println("Flag is set to true");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("Thread 2 is running");
            while (!sharedResource.isFlag()) { // Visibility Problem
            }
            System.out.println("Thread 2 is finished");
        });

        thread1.start();
        thread2.start();
    }

}
