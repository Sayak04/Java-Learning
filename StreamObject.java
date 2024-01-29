import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamObject {

    public static void main(String[] args) {

        // Stream API - collection process
        // collection / group of objects / Arrays

        // 1 - blank
        Stream<Object> emptyStream = Stream.empty();
        emptyStream.forEach(element -> {
            System.out.println(element);
        });

        // 2 - array, object, collection
        String names[] = { "Sayak", "Paul", "Anu" };
        Stream<String> stream1 = Stream.of(names);

        stream1.forEach(e -> System.out.println(e));

        // filter(Predicate)
        // -> boolean value function
        // -> filters if true adds
        List<String> names1 = Arrays.asList("Aman", "Ankit", "Sayak", "Soham");
        names1.stream().filter(e -> e.startsWith("A")).forEach(e -> System.out.println(e));

        // map(Function)
        // performs operation on each elememt
        List<Integer> numbers = Arrays.asList(2,3,4,5);

        List<Integer> squares = numbers.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(squares);
    }
}
