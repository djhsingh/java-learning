package djh.learn.java19;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamReduce {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>(List.of(14,2,3,4,5,6,7,8,9));
        System.out.println(intList.stream().reduce((acc,num)->acc+num));
        System.out.println(intList.stream().max(Comparator.naturalOrder()));

        List<String> stringList = List.of("java","is","awsome");
        System.out.println(stringList.stream().reduce((acc,str)->acc+" "+str));
    }
}
