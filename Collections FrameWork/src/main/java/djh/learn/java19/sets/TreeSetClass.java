package djh.learn.java19.sets;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetClass {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>(Set.of(54,32,56,76,12,98,11,6));
        //data is in accending order
        //null is not accepted
        //duplicate values are not accepted
        System.out.println(treeSet);
        System.out.println(treeSet.headSet(12));
        System.out.println(treeSet.tailSet(12));

        System.out.println(treeSet.higher(76));
        System.out.println(treeSet.lower(76));

        System.out.println(treeSet.pollFirst());
        System.out.println(treeSet.pollLast());
        System.out.println(treeSet);
    }
}
