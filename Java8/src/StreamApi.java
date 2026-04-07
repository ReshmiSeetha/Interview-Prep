import java.util.Arrays;
import java.util.List;
//import java.util.stream.Stream;
import java.util.function.Predicate;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 10, 6, 8, 9, 7);

        // Stream<Integer> dataStream = nums.stream();

        // filter(n -> n%2==1) filter takes an object of Preditcate which is an
        // Interface with test() method
        Predicate<Integer> predi = new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                return n % 2 == 1;
            }
        };

        // We are creating 3 streams in it , we are replacing we are not duplicating it.
        int result = nums.stream()
                .filter(predi)
                .sorted()
                .map(n -> n * 2)
                .reduce(0, (a, b) -> a + b);

        System.out.println(result);

        // Double the data this also returns a stream
        // dataStream.map(n -> n * 2).forEach(n -> System.out.println(n));

        /*
         * Returns a stream
         * Stream<Integer> sortedData = dataStream.sorted();
         * sortedData.forEach(n -> System.out.println(n));
         */

        // long count = dataStream.count();
        // System.out.println(count);

        // Pick up data one by one and print it
        // dataStream.forEach(n -> System.out.println(n));

        // Try to use the stream again
        // dataStream.forEach(n -> System.out.println(n));
    }
}
