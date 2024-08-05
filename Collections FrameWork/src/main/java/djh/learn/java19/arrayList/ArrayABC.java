package djh.learn.java19.arrayList;

import java.util.Arrays;
import java.util.Scanner;

class ArrayABC {
    public static void main(String args[] ) throws Exception {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] array = new int[n];
        for(int i =0 ; i<n;i++){
            array[i]=sc.nextInt();
        }
        Arrays.sort(array);
        for (int i:array) {
            System.out.println(i);
        }
    }
}
