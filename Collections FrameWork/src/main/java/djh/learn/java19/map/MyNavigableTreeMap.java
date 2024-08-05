package djh.learn.java19.map;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class MyNavigableTreeMap {
    public static void main(String[] args) {
        NavigableMap<Integer,String> map = new TreeMap<>();
        //by default sorted in accending order
        map.put(41,"Ram");
        map.put(52,"BalRam");
        map.put(33,"Ghanshyam");
        map.put(24,"Shyam");
        map.put(15,"ManiRam");
        System.out.println(map);

        map.putAll(Map.of(45,"Chandiram",67,"Dhaniram",4,"Molaram"));
        System.out.println(map);
        System.out.println(map.ceilingEntry(59));
        System.out.println(map.ceilingKey(59));
        System.out.println(map.floorEntry(59));
        System.out.println(map.floorKey(59));
        System.out.println("----------------");
        System.out.println(map.headMap(33));
        System.out.println(map.tailMap(33));
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.values());
        System.out.println(map.descendingMap());
        System.out.println(map.descendingKeySet());
        System.out.println(map.pollLastEntry());
        System.out.println(map);
        System.out.println(map.pollFirstEntry());
        System.out.println(map);
        //
        SortedMap<Integer,String> subMap = map.subMap(50,90);
        System.out.println(subMap);

    }
}
