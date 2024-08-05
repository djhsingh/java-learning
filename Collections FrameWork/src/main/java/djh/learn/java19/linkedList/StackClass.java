package djh.learn.java19.linkedList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        Stack<Integer> integers = new Stack<>();
        //push, pop, peek
        //add
        integers.add(34);
        integers.add(3);
        integers.add(12);
        integers.add(22);
        integers.add(56);
        System.out.println(integers);
        integers.push(66);
        System.out.println(integers);
        integers.pop();
        System.out.println(integers);
        System.out.println(integers.firstElement());
        System.out.println(integers.peek());

        Deque<Integer> integerDeque = new LinkedList<>();
        integerDeque.push(34);
        integerDeque.push(65);
        integerDeque.push(23);
        integerDeque.push(78);
        System.out.println(integerDeque);
        System.out.println(integerDeque.peek());
        System.out.println(integerDeque.pop());
    }
}
