package djh.learn.java19.arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionMethods {
    public static void main(String[] args) {
        Collection<Integer> collection1 = new ArrayList<>();
        collection1.add(1);
        Collection<Integer> collection2 = List.of(2, 3, 4, 5, 6);
        Collection<Integer> collection3 = new ArrayList<>() {{
            add(4);
            add(5);
            add(6);
        }};

        System.out.println(collection1);
        System.out.println(collection2);
        System.out.println(collection3);

        collection1.addAll(collection2);
        System.out.println(collection1);
        /*collection1.remove(1);
        System.out.println(collection1);
        collection1.removeAll(collection2);
        System.out.println(collection1);*/
        //  collection1.removeIf(c -> (c % 2 == 0));
        System.out.println(collection1);

        collection1.retainAll(collection3);
        System.out.println(collection1);

        System.out.println(collection1.contains(4));
        System.out.println(collection1.containsAll(collection3));
        System.out.println(collection1.isEmpty());
        System.out.println(collection1.size());

        Iterator iterator = collection1.iterator();
        while(iterator.hasNext())
            System.out.print(" - "+iterator.next());
        System.out.println("--------");
        collection1.forEach(c -> System.out.println(c));
        collection1.forEach(System.out::println);
    }
}
