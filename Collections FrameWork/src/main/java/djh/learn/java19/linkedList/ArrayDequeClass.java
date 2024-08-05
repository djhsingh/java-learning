package djh.learn.java19.linkedList;

import java.util.ArrayDeque;

public class ArrayDequeClass {
    public static void main(String[] args) {
        ArrayDeque<Integer> integers = new ArrayDeque<>();
        //Insertion from tail: offer offerlast addlast
        //remove from head: poll pollfirst removefirst
        // examine from head: peek peekfirst getfirst
        integers.add(34);
        integers.add(87);
        integers.add(66);
        integers.add(23);
     //   integers.add(null);
        System.out.println(integers);

        ArrayDeque<Integer> integer2 = new ArrayDeque<>();
        integer2.offer(34);
        integer2.offer(45);
        integer2.offer(12);
        integer2.offer(65);
        System.out.println(integer2);
        integer2.offerFirst(56);
        System.out.println(integer2);
        integer2.offerLast(87);
        System.out.println(integer2);

        System.out.println(integer2.peek());
        System.out.println(integer2.peekFirst());
        System.out.println(integer2.peekLast());
        System.out.println(integer2.getFirst());
        System.out.println(integer2.getLast());
        integer2.remove();
        System.out.println(integer2);
        integer2.poll();
        System.out.println(integer2);
        integer2.pollLast();
        integer2.removeFirst();
        integer2.removeLast();
        System.out.println(integer2);
    }
}
