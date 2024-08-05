package djh.learn.java19;

public class VariableCapturing {
    public static void main(String[] args) {
        //java: local variables referenced from a lambda expression must be final or effectively final
        //don't change the value of variable while using in lambda expression
        int x =6;
      //  x+=45;
        MyFirstInterface myFirstInterface = ()-> System.out.println(x);
        myFirstInterface.printNumber();
    }
}
