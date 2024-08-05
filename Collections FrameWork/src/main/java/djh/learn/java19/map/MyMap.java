package djh.learn.java19.map;

import netscape.javascript.JSObject;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMap {
    public static void main(String[] args) {
        // adding the values
        //put putAll putIfAbsent computeIfAbsent,computeIfPresent,compute
        Map<Integer,String> stringStringMap = new HashMap<>();
        stringStringMap.put(1,"one");
        stringStringMap.put(2,"two");
        System.out.println(stringStringMap);
        Map<Integer,String> otherMap = new HashMap<>(Map.of(1,"onee",2,"twoo",3,"threee",4,"fourr"));
        System.out.println(otherMap);
      //  otherMap.putAll(stringStringMap);
        otherMap.putIfAbsent(3,"threeee");
        otherMap.putIfAbsent(5,"fivee");
        otherMap.computeIfAbsent(6,c->"Sixx");
        otherMap.computeIfPresent(6,(k,v)->"Sixxxx");
        otherMap.compute(6,(k,v)->"Sixty");
        otherMap.compute(7,(k,v)->"Sevenn");
        System.out.println(otherMap);

        Set<Integer> keys = otherMap.keySet();
        keys.forEach(System.out::println);

        Collection<String> values = otherMap.values();
        values.forEach(System.out::println);

        for(Map.Entry<Integer,String> entry: otherMap.entrySet() ){
            System.out.println(entry);
            System.out.println(entry.getKey()+"----"+entry.getValue());
        }

        otherMap.merge(4,"New Four",(oV,nV)->nV);
        System.out.println(otherMap);
    }
}
