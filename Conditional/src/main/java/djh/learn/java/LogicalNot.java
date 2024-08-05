package djh.learn.java;

public class LogicalNot {
    public static void main(String[] args) {
        System.out.println(!true);
        System.out.println(!false);
        System.out.println(!true == false);
        System.out.println(!false == true);
        boolean x = !(5 > 2);
        System.out.println(x);
        System.out.println(!(true && true));
        System.out.println(!(true || false));
        System.out.println(!(false || false));
    }
}
