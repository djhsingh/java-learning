package djh.learn.java;

public class StringEquality {
    public static void main(String[] args) {
        String str1 ="java";
        String str2 ="java";
        System.out.println(str1 == str2);

        String o1 = new String("javalearn");
        String o2 = new String("javalearn");
        System.out.println(o1 ==o2);
        System.out.println(o1.equals(o2));
    }
}
