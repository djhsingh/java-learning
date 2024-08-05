package djh.learn.java19.map;

import djh.learn.java19.arrayList.SortingList;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class MySortedTreeMap {
    public static void main(String[] args) {
        SortedMap<Integer,String> map = new TreeMap<>();
        //by default sorted in accending order
        map.put(41,"Ram");
        map.put(52,"BalRam");
        map.put(33,"Ghanshyam");
        map.put(24,"Shyam");
        map.put(15,"ManiRam");
        System.out.println(map);

        map.putAll(Map.of(45,"Chandiram",67,"Dhaniram",4,"Molaram"));
        System.out.println(map);
        System.out.println(map.headMap(33));
        System.out.println(map.tailMap(33));
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.values());
        SortedMap<Integer,String> subMap = map.subMap(50,90);
        System.out.println(subMap);
    }
}
