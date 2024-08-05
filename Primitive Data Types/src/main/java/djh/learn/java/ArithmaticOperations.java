package djh.learn.java;

public class ArithmaticOperations {
    public static void main(String[] args) {
        int x = 8;
        int y = 5;
        int addition = x + y;
        double z = 56.3;
        int res = (int) (x + z);
        int mul = x * y;
        double div = (double) x /  y;
        int mod = x % y;
        int subs = (int) (x - z);
        System.out.println("Addition is " + addition);
        System.out.println(res);
        System.out.println(subs);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(mod);

        int l = 6;
        //++ increment operator
        l++;
        System.out.println(l);

        // -- decrement operator
        l--;
        System.out.println(l);
    }
}
