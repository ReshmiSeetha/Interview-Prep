To process the collection of data we can use Stream API.

Stream API is a way to process the collection of data in a **functional, declarative, parallel, lazy, pipeline** way.

When you always want to work with data it's always better to let it be immutable.Don't change the original data.

Whatever I do with values will not affect my list.

Example:

     List<Integer> nums = Arrays.asList(4, 5, 6, 8, 9);
    
    Creating a stream out of it
        nums.stream();
        stream method is present in Collection interface.It returns a sequential stream.

        We will be working with the stream it will not affect the original list.Even if we change the value of stream it will not affect the original list.

        Once you consume the stream you cannot use it again. You have to create a new stream.It prevents from data inconsistency because once you use and it closes the stream.
    
    If you have huge amount of data and if u want to do parallel processing using multiple threads we can use parallelStream(). Thread will not be created by us it will be handled by java
        nums.parallelStream();
    
filter()
    It takes an object of Predicate. Predicate is an functional Interface it has a method called test it
    returns true or false.

    