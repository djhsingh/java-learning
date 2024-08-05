package djh.learn.java19.practceCollections;

import java.util.*;
import java.util.stream.Collectors;

public class MyArrayList {
    public static void main(String[] args) {

         /*   List oldList = new ArrayList();
            oldList.add(33);
            oldList.add(87);
            List list = new ArrayList<>();
            list.add(45);
            list.add(1,35);
            list.addAll(1,oldList);
            System.out.println(list);
        System.out.println(list.contains(33));
        System.out.println(list.isEmpty());
        System.out.println(list.subList(1,4));
        System.out.println(list.size());
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        Object[] array = list.toArray();
        System.out.println(array);
        System.out.println(list.remove(1));
        list.replaceAll(v-> ((int)v*2));
        System.out.println(list);
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
        list.sort(Comparator.reverseOrder());
        System.out.println(list);
        list.add(null);
        list.sort(Comparator.nullsFirst(Comparator.naturalOrder()));
        System.out.println(list);


        ArrayList newArrayList = new ArrayList<>();
        ArrayList newArrayList2 = new ArrayList<>(20);
        ArrayList newArrayList3 = new ArrayList<>(List.of(23,3,4,5,6,7,6));
        System.out.println(newArrayList);
        System.out.println(newArrayList2);
        System.out.println(newArrayList3);
        newArrayList3.ensureCapacity(20);
        System.out.println(newArrayList3.size());

        newArrayList3.trimToSize();
        System.out.println(newArrayList3.size());
        List slist = Collections.synchronizedList(newArrayList3);
        System.out.println(slist);

        LinkedList lList = new LinkedList();
        lList.add(34);
        lList.add(66);
        System.out.println(lList);
        lList.addFirst(77);
        System.out.println(lList);
        lList.addLast(98);
        System.out.println(lList);
        System.out.println(lList.getFirst());
        System.out.println(lList.getLast());
        System.out.println(lList.peek());
        System.out.println(lList.peekFirst());
        System.out.println(lList.peekLast());
        lList.offer(55);
        System.out.println(lList);
        lList.offerFirst(12);
        System.out.println(lList);
        lList.offer(27);
        System.out.println(lList);
        Iterator iterator1 =  lList.descendingIterator();
        while(iterator1.hasNext()){
            System.out.println( iterator1.next());
        }
        lList.push(76);
        System.out.println(lList);
*/
        /*Deque deque = new LinkedList();
        deque.push(34);
        deque.push(22);
        deque.addLast(44);
        deque.addFirst(14);
        System.out.println(deque);*/


        /*Queue queue = new LinkedList();
        queue.add(45);
        queue.offer(23);
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.element());
        queue.poll();
        System.out.println(queue);


        Stack stack = new Stack();
        stack.add(45);
        stack.push(25);
        stack.push(34);
        System.out.println(stack);
        System.out.println(stack.empty());
        System.out.println(stack.firstElement());
        System.out.println(stack.search(324));
        System.out.println(stack.pop());
        System.out.println(stack);*/

        Set set = new HashSet<>();
        set.add(34);
        set.add(14);
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());


        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(343);
        System.out.println(linkedHashSet);

        LinkedHashSet set2 =  LinkedHashSet.newLinkedHashSet(23);
        System.out.println(set2);
    }
}
