package djh.learn.java19.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MyTreeMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new TreeMap<>();
        //by default sorted in accending order
        map.put(41,"Ram");
        map.put(52,"BalRam");
        map.put(33,"Ghanshyam");
        map.put(24,"Shyam");
        map.put(15,"ManiRam");
        System.out.println(map);

        map.putAll(Map.of(45,"Chandiram",67,"Dhaniram",4,"Molaram"));
        System.out.println(map);
    }
}
