class Demo {
    public static void printMsg() {
        System.out.println("Hello");
    }
}

public class MethodRefernceExample {
    public static void main(String[] args) {
        // List<String> names = Arrays.asList("John", "Jane", "Bob", "Alice");

        // names.stream().forEach(System.out::println);// println belongs to which class
        // it's a method of out and it belogs
        // // to system
        // Since it's an functional interface we can use lambda expression

        // Lambda Expression
        Runnable r = () -> Demo.printMsg();
        Thread t1 = new Thread(r);
        t1.start();

        // Method Reference
        Runnable r1 = Demo::printMsg;
        Thread t2 = new Thread(r1);
        t2.start();
    }
}
