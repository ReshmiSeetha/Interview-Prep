**Functional Interface** 
    A interface which contains only one abstract method is called functional interface.
    Most of the interfaces in java are functional interfaces.
    Example : Runnable, Comparable, Comparator, ActionListener, etc.

**@FunctionalInterface**
    It is an annotation which is used to denote that an interface is a functional interface.
    If an interface is annotated with @FunctionalInterface and it contains more than one abstract method, then it will throw a compile-time error.

We cannot create an object for an interface but we can create an object for the implementation of the interface

In older versions we can create a class which implements this interface and then create an object for the class.

    Example :
        class InnerDemoImpl implements InnerDemo {
            @Override
            public void show() {
                System.out.println("Hello World");
            }
        }
        InnerDemo obj = new InnerDemoImpl();
        obj.show();

What if I don't want to create a class for the implementation of the interface?
    If I am using the class only once, then I can use an anonymous class.
    If we have more classes I have to maintain more files, which is not a good practice.
    We can create the implementation in the same class where we are using it.
    And this concept is called Anonymous Inner Class.
    Anonymous because there is no name for the Class.
    Inner because we are creating the class inside another class.

        Example :
            InnerDemo obj = new InnerDemo() {
                @Override
                public void show() {
                    System.out.println("Hello World");
                }
            };
            obj.show();

But Functional Interface has only one abstract method so we can use Lambda Expression. Compiler knows which method to implement.

        Example :
            InnerDemo obj = () -> System.out.println("Hello World");
            obj.show();

Extra Facts:
    Every class in java extends an Object class so we can use the abstract methods of object class inside Functional Interface because anyway it's getting implemented.

A **Method Reference** is a shorthand for lambda expressions that calls an existing method.

Instead of writing 

    x -> x.method()

We can write

    ClassName::methodName

Method reference is a shorthand notation of lambda expressions used to refer to an existing method. It improves readability and reduces boilerplate code. It can reference static methods, instance methods, and constructors.