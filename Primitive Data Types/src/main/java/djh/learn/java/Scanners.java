package djh.learn.java;

import java.util.Scanner;

public class Scanners {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int x = sc.nextInt();
        System.out.println("Enter the second number");
        int y = sc.nextInt();
        int result = x + y;
        System.out.println("Sum of two numbers is " + result);

    }
}
