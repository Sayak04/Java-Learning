import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApimain {
    public static void main(String[] args) {

        // Q) create a list and filter all even numbers from list

        // create a list
        List<Integer> list1 = Arrays.asList(2, 4, 5, 10, 50, 21, 22, 67);

        // add even numbers to list2 without stream api
        List<Integer> listEven = new ArrayList<Integer>();

        for (Integer i : list1) {
            if (i % 2 == 0) {
                listEven.add(i);
            }
        }

        System.out.println(list1);
        System.out.println(listEven);

        // Using stream api
        // -> once a stream is used it can't be reused
        // take out the stream from list1
        // Stream is an interface
        Stream<Integer> stream = list1.stream();
        List<Integer> listEven1 = stream.filter(element -> element % 2 == 0).collect(Collectors.toList());

        // take out all numbers greater than 50

        List<Integer> greaterThanFifty = list1.stream().filter(element -> element > 50).collect(Collectors.toList());

        System.out.println(listEven1);
        System.out.println(greaterThanFifty);

    }
}