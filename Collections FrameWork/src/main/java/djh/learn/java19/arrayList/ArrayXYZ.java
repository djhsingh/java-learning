package djh.learn.java19.arrayList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class ArrayXYZ {
    public static void main(String args[] ) throws Exception {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] array = new String[n];
        sc.nextLine();
        for(int i=0;i<n;i++){
            array[i]= sc.nextLine();
        }
        for(int i=0;i<n;i++){
            System.out.println(array[i]);
        }
        for(int i=0;i<array.length;i++){
            int sum=0;
            String[] stringArray = array[i].split(" ");
            int[] myArray = new int[stringArray.length];
            for(int r = 0; r < myArray.length; r++) {
                myArray[r] = Integer.parseInt(stringArray[r]);
            }
            for(int l=0 ;l<myArray.length;l++){
                sum+=myArray[l];
            }
            System.out.println(sum);
        }

    }
}
