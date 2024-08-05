package djh.learn.java19;

import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamLearning {
    public static void main(String[] args) {
        OptionalInt min = IntStream.of(1,2,3).min();
        OptionalLong max = LongStream.of(1,25,3).max();
        OptionalDouble avg = DoubleStream.of(1,2,3).average();

        List<Integer> intList = new ArrayList<>(List.of(14,2,3,4,5,6,7,8,9));
        Optional<Integer> listMin  = intList.stream().min(Comparator.naturalOrder());

        System.out.println(min);
        System.out.println(max);
        System.out.println(avg);
        System.out.println(listMin.get().intValue());
        listMin.isEmpty();
        listMin.isPresent();
        listMin.get();
        listMin.orElse(null);
        Optional<String> optionals = Optional.of("john");
        Optional<String> optionals2 = Optional.ofNullable(null);
        System.out.println(optionals.get());
        System.out.println(optionals2.orElse("doesn't contain"));
        intList.stream().forEach(System.out::println);
        System.out.println(intList.stream().findAny());

        System.out.println(intList.stream().allMatch(v->v%2==0));
        System.out.println(intList.stream().anyMatch(v->v%2==0));
        System.out.println(intList.stream().noneMatch(v->v%2==0));

    }
}
