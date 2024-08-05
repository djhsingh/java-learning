package djh.learn.java19.sets;

import java.util.*;

public class MySets {
    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();
        //no duplicate value accepted
        integerSet.add(34);
        integerSet.add(45);
        integerSet.add(12);
        integerSet.add(78);
        integerSet.add(23);
        integerSet.add(null);
        System.out.println(integerSet);
        Set<Integer> integerSet2 = new HashSet<>(Set.of(2,3,4));
        integerSet.addAll(integerSet2);
        integerSet.removeAll(integerSet2);
        System.out.println(integerSet);
        System.out.println(integerSet.isEmpty());
        System.out.println(integerSet.size());
        integerSet.forEach(System.out::println);
        Iterator<Integer> iterator= integerSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
