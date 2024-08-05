package djh.learn.java19;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyStream {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1,25,6,4,3,2);
        System.out.println(integerStream);
        DoubleStream doubleStream = DoubleStream.of(34.3,21.1,32.2);
        System.out.println(doubleStream);
        IntStream intStream = IntStream.range(1,20);
        IntStream intStreamRange = IntStream.rangeClosed(10,30);
        Stream<Integer> streamArray = Arrays.stream(new Integer[]{3,4,5,2,78});
        List<Integer> list  = List.of(4,3,2,7,8,1);
        Stream<Integer> streamFromList = list.stream();
        Stream<Integer> parallelList = list.parallelStream();

        Stream<Integer> streamSet = Set.of(2,3,4,5,6,7).stream();
    }
}
