package djh.learn.java19;

import java.security.PrivilegedAction;

public class Main {
    public static void main(String[] args) {
        MyFirstInterface myFirstInterface = ()-> System.out.println(5);
        myFirstInterface.printNumber();

        MySecondInterface mySecondInterface = (str)-> System.out.println(str);
        mySecondInterface.printString("Welcome to Lambda Expression");

        MyThirdInterface myThirdInterface = (x,y) -> System.out.println(x+y);
        myThirdInterface.add(4,5);

        MyFourthInterface myFourthInterface = (x,y) -> x+y;
        int result = myFourthInterface.add(7,6);
        System.out.println(result);
        System.out.println(myFourthInterface.add(7,8));
    }
}