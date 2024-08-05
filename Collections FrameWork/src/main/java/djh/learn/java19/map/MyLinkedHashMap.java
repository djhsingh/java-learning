package djh.learn.java19.map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class MyLinkedHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new LinkedHashMap<>();
        map.put(41,"Ram");
        map.put(52,"BalRam");
        map.put(33,"Ghanshyam");
        map.put(24,"Shyam");
        map.put(15,"ManiRam");
        System.out.println(map);

        map.putIfAbsent(15,"Shriram");
        map.computeIfPresent(15,(k,v)->"Shriram");
        map.putIfAbsent(24, "Shriram");
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
        map.forEach((k,v)-> System.out.println(k+"---"+v));


    }
}
