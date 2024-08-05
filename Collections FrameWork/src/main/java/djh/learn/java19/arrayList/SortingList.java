package djh.learn.java19.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingList {
    public static void main(String[] args) {
        Integer[] array = {1,2,7,3,9,4,8,6,5};
        List<Integer> list = new ArrayList<>(Arrays.asList(array));
        System.out.println(list);
        // list.sort(Integer::compareTo);
      //  list.sort(Comparator.naturalOrder());
       // list.sort(Comparator.reverseOrder());
        System.out.println(list);
        list.add(null);
     //   list.sort(Comparator.nullsFirst(Comparator.naturalOrder()));
      //  list.sort(Comparator.nullsFirst(Comparator.reverseOrder()));
        list.sort(Comparator.nullsLast(Comparator.naturalOrder()));
      //  list.sort(Comparator.nullsLast(Comparator.reverseOrder()));
        System.out.println(list);
    }
}
