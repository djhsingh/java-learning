package djh.learn.java19;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsClass {
    public static void main(String[] args) {
        List<String> stringList = List.of("java","is","awsome");
        String joinedString = stringList.stream().collect(Collectors.joining(" ",">>>>","<<<<"));
        System.out.println(joinedString);

        Map<String,Integer> map = stringList.stream().collect(Collectors.toMap(s1->s1, s1->s1.length()));
        System.out.println(map);

        Map<Integer,List<String>> collect = stringList.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(collect);
    }
}
