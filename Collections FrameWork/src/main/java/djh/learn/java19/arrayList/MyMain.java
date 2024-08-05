package djh.learn.java19.arrayList;

import java.util.ArrayList;
import java.util.List;

public class MyMain {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        //accept null values and duplicate values
        //fast random access
        //0 based index
        //insertion order is maintained
        //doesn't store primitive data types
        //default size is 10
        //threshold/min capacity/load factor is 0.75
        //increase the size by 50% when crosses the threshold
        integerList.add(99);
        integerList.add(12);
        integerList.add(34);
        integerList.add(73);
        integerList.add(2,533);
        integerList.add(null);
        integerList.add(null);
        integerList.add(null);
        integerList.add(12);
        System.out.println(integerList);
    }
}
