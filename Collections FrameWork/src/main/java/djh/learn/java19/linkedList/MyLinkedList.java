package djh.learn.java19.linkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MyLinkedList {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(3);
        list.add(6);
        list.add(5);
        System.out.println(list);
        list.sort(Integer::compareTo);
        System.out.println(list);

        //To do
        Queue<String> stringQueue = new LinkedList<>();
        //offer,poll,peak
        //add , remove, element
        stringQueue.add("Ram");
        stringQueue.add("Aam");
        stringQueue.add("Haraam");
        stringQueue.add("Salaam");
        stringQueue.add("Badnaam");
        System.out.println(stringQueue);
        stringQueue.add("Kalaam");
        System.out.println(stringQueue.offer("Parnaam"));
        System.out.println(stringQueue);
        stringQueue.remove();
        System.out.println(stringQueue);
        stringQueue.poll();
        System.out.println(stringQueue);
    }
}
