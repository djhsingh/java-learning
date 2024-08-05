package djh.learn.java19.sets;

import java.util.HashSet;
import java.util.Set;

public class Setsmethods {
    public static void main(String[] args) {
        HashSet<Integer> firstSet = new HashSet<>(Set.of(1,2,3,4,5,6));
        HashSet<Integer> secondSet = new HashSet<>(Set.of(4,5,6,7,8,9));
        HashSet<Integer> thirdSet = new HashSet<>(Set.of(1,2,3));

        //subset
        System.out.println(firstSet.containsAll(thirdSet));
        //union
        /*System.out.println(firstSet.addAll(thirdSet));
        System.out.println(firstSet);
        System.out.println(firstSet.addAll(secondSet));
        System.out.println(firstSet);
        System.out.println(secondSet.addAll(thirdSet));
        System.out.println(secondSet);

        //difference
        firstSet.removeAll(thirdSet);
        System.out.println(firstSet);
        */
        //intersection
        firstSet.retainAll(secondSet);
        System.out.println(firstSet);
    }
}

