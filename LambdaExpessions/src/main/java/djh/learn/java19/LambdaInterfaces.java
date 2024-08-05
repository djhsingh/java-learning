package djh.learn.java19;

public class LambdaInterfaces {
}

@FunctionalInterface
interface MyFirstInterface {
    void printNumber();
}

@FunctionalInterface
interface MySecondInterface {
    void printString(String string);
}

@FunctionalInterface
interface MyThirdInterface {
    void add(int a, int b);
}

@FunctionalInterface
interface MyFourthInterface {
    int add(int a, int b);
}