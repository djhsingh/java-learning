package djh.learn.java19.sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetClass {
    public static void main(String[] args) {
        LinkedHashSet<Integer> integers = new LinkedHashSet<>(Set.of(1,2,3,4,5,6,7,8));
        System.out.println(integers);
        integers.forEach(System.out::println);
        integers.add(10);
        System.out.println(integers);
        integers.retainAll(Set.of(8,9,10));
        System.out.println(integers);
        System.out.println(integers.size());
        System.out.println(integers.isEmpty());
    }
}
