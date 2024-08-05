package djh.learn.java19;

import java.util.Scanner;

public class WithREsource {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)){

        }


        try(Scanner sc = new Scanner(System.in);Scanner bc = new Scanner(System.in)){

        }
        catch (Exception e){

        }finally {

        }
    }
}
