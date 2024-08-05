package djh.learn.java19;

public class InstanceOfOperator {
    static String name="hello";

    public static void main(String[] args) {
        System.out.println(name instanceof String);
        System.out.println(name instanceof Object);
        System.out.println((Integer)43 instanceof Integer);
    }
}
