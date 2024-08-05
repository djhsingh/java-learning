package djh.learn.java;

import java.util.Arrays;

public class ArrayLearn {
    public static void main(String[] args) {
        System.out.println("Learning Arrays...");
        int[] myArray = new int[3];
        int[] myArray2 = {1,4,6,7};
        System.out.println(myArray.length);
        String[] names = new String[3];
        String[] names2 = {"john","tom"};
        System.out.println(names2[0]);
        System.out.println(names2[1]);

        names2[0]="Marry";
        System.out.println(names2[0]);
        System.out.println("Arrays to String :"+ Arrays.toString(names2));
        String string = Arrays.toString(names2);
        System.out.println(string.charAt(2));

        String[] namez = {"Ram","Aman","Sunil","Daman"};
        for (int i = 0; i < namez.length ; i++) {
            System.out.println(namez[i]);
        }
    }
}
