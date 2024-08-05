package djh.learn.java;

import java.util.Scanner;

public class InsuranceRate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rate = 0;
        System.out.println("Welcome to Insurance Rate Software :)");
        System.out.print("Enter your Age: ");
        int age = sc.nextInt();
        System.out.println("Are you a Smoker? True or False");
        boolean smoker = sc.nextBoolean();
        boolean isSmoker;
        if (smoker) {
            isSmoker = true;
        } else {
            isSmoker = false;
        }
        if (25 < age && age < 35){
            if(isSmoker){
                rate=92;
            } else{
                rate=33;
            }
        } else if (36 < age && age < 45){
            if(isSmoker){
                rate=179;
            } else{
                rate=50;
            }
        } else if (46 < age && age < 65){
            if(isSmoker){
                rate=1007;
            } else{
                rate=318;
            }
        }
        System.out.println("Rate is: $"+rate);
    }
}
