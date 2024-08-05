package djh.learn.java19;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            System.out.println("Before Exception");
            Scanner sc = new Scanner(System.in);
            int val= sc.nextInt();
            System.out.println(12/val);
           // System.out.println("After Exception");
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        } catch (InputMismatchException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("After Exception");
        }
    }
}