package djh.learn.java;

import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isInt = in.hasNextFloat();
        if (isInt) {
            int num = in.nextInt();
            if (num > 0) {
                System.out.println("Positive");
            } else if (num < 0) {
                System.out.println("Negative");
            } else {
                System.out.println("Zero");
            }
        } else {
            System.out.println("Enter only Integer Number");
        }
    }
}
