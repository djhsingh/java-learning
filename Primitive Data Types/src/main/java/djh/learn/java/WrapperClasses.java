package djh.learn.java;

public class WrapperClasses {
    public static void main(String[] args) {
        String stringNumber = "5";
        System.out.println(stringNumber);
        int num = Integer.parseInt(stringNumber);
        System.out.println(num);
        Integer x = 5; //autoboxing/implicit //boxing
        Integer  b = Integer.valueOf(34);
        int d = b;  //unboxing
    }
}
