package djh.learn.java;

import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int score = 0;
        System.out.println("Welcome to Java Quiz :)");
        System.out.println("Question 1. JVM i a program that executes compiled Java code?");
        boolean ans = in.nextBoolean();
        if (ans == true) {
            score++;
        }
        System.out.println("Question 2. String is a primitive Data Type?");
        ans = in.nextBoolean();
        if (ans == false) {
            score++;
        }
        System.out.println("Question 3. Java has nine primitive data types?");
        ans = in.nextBoolean();
        if (ans == false) {
            score++;
        }

        if (score == 3) {
            System.out.println("Wow! You are amazing!");
        } else if (score == 2) {
            System.out.println("Good");
        } else {
            System.out.println("Need Improvement");
        }
    }
}
