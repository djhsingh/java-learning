package djh.learn.java19;

import java.util.Scanner;

public class CustomException {
    public static void main(String[] args)  {

            Scanner sc = new Scanner(System.in);
            int val = sc.nextInt();
            if(val!=0){
                System.out.println(10/val);
            } else{
                throw new DivideByZeroException("Dividing by zero is not possible");
            }

    }
}
