package djh.learn.java;

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char grade = in.next().charAt(0);
       /* if(grade=='A'){
            System.out.println("Excellent");
        } else if(grade=='B' || grade=='C'){
            System.out.println("Very Good");
        } else if(grade=='D'){
            System.out.println("Passed");
        } else if(grade=='F'){
            System.out.println("Failed");
        } else{
            System.out.println("Unknown Grade");
        }*/

        /*switch (grade){
            case 'A' :
                System.out.println("Excellent");
                break;
            case 'B' :
            case 'C' :
                System.out.println("Very Good");
                break;
            case 'D' :
                System.out.println("Passed");
                break;
            case 'F' :
                System.out.println("Failed");
                break;
            default :
                System.out.println("Unknown Grade");
                break;
        }*/
       String result =  switch (grade){
            case 'A' :
                yield     "Excellent";
            case 'B' :
            case 'C' :
                yield    "Very Good";
            case 'D' :
                yield    "Passed";
            case 'F' :
                yield  "Failed";

            default :
                yield "Unknown Grade";

        };
        System.out.println(result);
    }
}
