package djh.learn.java19.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListMethods {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("tom");
        list1.add("jerry");
        list1.add("butch");
        System.out.println(list1);
        list1.add(1,"pam");
        System.out.println(list1);

        List<String> list2 = new ArrayList<>(){{
            add("first");
            add("second");
        }};

        list1.addAll(0,list2);
        System.out.println(list1);
        System.out.println(list1.indexOf("second"));
        list1.replaceAll(c->c.toUpperCase());
        System.out.println(list1);
        System.out.println(list1.subList(2,5));
        list1.replaceAll(String::toLowerCase);
        System.out.println(list1);
        list1.set(0,"zero element");
        System.out.println(list1);
       // list1.sort(String::compareTo);
        System.out.println(list1);

        Iterator iterator = list1.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());

        ListIterator listIterator = list1.listIterator();
        while(listIterator.hasNext())
            System.out.println(listIterator.next());
        while (listIterator.hasPrevious())
            System.out.println(listIterator.previous());

    }
}
