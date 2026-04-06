
@FunctionalInterface
interface InnerDemo {
    void show();

    String toString();// Abstract method of Object class
}

// Since we cannot create an object for an interface but we can create an object
// for the implementation of the interface
class InnerDemoImpl implements InnerDemo {
    @Override
    public void show() {
        System.out.println("Hello World");
    }
}

public class Demo {
    public static void main(String[] args) {
        // InnerDemo obj = new InnerDemoImpl();

        // Anonymous Inner Class
        /***
         * InnerDemo obj = new InnerDemo() {
         * 
         * @Override
         *           public void show() {
         *           System.out.println("Hello World");
         *           }
         *           };
         *           obj.show();
         ***/

        // Lambda Expression
        InnerDemo obj = () -> System.out.println("Hello World");
        obj.show();
    }
}
