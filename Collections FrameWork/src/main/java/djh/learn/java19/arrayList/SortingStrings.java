package djh.learn.java19.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingStrings {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(List.of("Hello","hai","okk","my","null"));
        System.out.println(stringList);
       // stringList.sort(String::compareTo);
       // stringList.sort(Comparator.naturalOrder());
      //  stringList.add(null);
      //  stringList.sort(Comparator.nullsFirst(Comparator.naturalOrder()));
     //   stringList.sort(String.CASE_INSENSITIVE_ORDER);
       // stringList.sort(Comparator.comparingInt(String::length));
     //   Comparator<String> comparator = Comparator.comparingInt(String::length);
        Comparator<String> comparator2= (s1,s2) -> Integer.compare(s1.length(),s2.length());
        Comparator<String> sortBySecondChar= (s1,s2) -> Integer.compare(s1.charAt(1),s2.charAt(1));
        stringList.sort(sortBySecondChar);
        System.out.println(stringList);

      //  Collections.sort(stringList);
     //   Collections.sort(stringList,String.CASE_INSENSITIVE_ORDER);
        Collections.sort(stringList,Collections.reverseOrder());
        System.out.println(stringList);

    }
}
