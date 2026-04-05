// class MyThread extends Thread {
//     public void run() {
//         System.out.println("Thread 1 is running");
//     }
// }

public class CreateThreadExample {
    public static Object sharedObject = new Object();

    public static void main(String args[]) {
        // MyThread obj = new MyThread();
        // obj.start();

        // Functional Interface
        // Thread obj2 = new Thread(() -> {
        // System.out.println("Thread 2 is running");
        // });

        // obj2.start();

        // Runnable Interface

        Runnable objRunnable = () -> {
            System.out.println("Thread 3 is running");
            System.out.println(Thread.currentThread().getName());
            System.out.println(sharedObject.hashCode());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 3 is finished");
        };

        Runnable objRunnable1 = () -> {
            System.out.println("Thread 4 is running");
            System.out.println(Thread.currentThread().getName());
            System.out.println(sharedObject.hashCode());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 4 is finished");
        };

        Thread obj3 = new Thread(objRunnable);
        // obj3.setDaemon(true);
        obj3.start();

        Thread obj4 = new Thread(objRunnable1);
        obj4.start();

        System.out.println("Main thread is finished");

    }
}