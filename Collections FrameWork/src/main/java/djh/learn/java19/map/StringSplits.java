package djh.learn.java19.map;

import java.util.*;

public class StringSplits {
    public static void main(String[] args) {
        //hashmap initial capacity is 16 and load factor is 0.75
        String str = "Hello Java Hello Java Java Python";
        String[] array = str.split(" ");
        System.out.println(Arrays.toString(array));
        Map<String,Integer> myMap = new HashMap<>();
        for(String string:array){
            myMap.put(string,myMap.getOrDefault(string,0));
            myMap.merge(string,1,(oV,nV)->oV+nV);
        }
        System.out.println(myMap);


        //find out the word postion
        //{Java=[1, 3, 4], Hello=[0, 2], Python=[5]}
        Map<String, List<Integer>> myPosition = new HashMap<>();
        for (int i = 0; i < array.length ; i++) {
            String word=array[i];
            if(myPosition.containsKey(word)){
                List<Integer> current = myPosition.get(word);
                current.add(i);
            } else{
                myPosition.put(word,new ArrayList<>(List.of(i)));
            }
        }
        System.out.println(myPosition);
    }
}
