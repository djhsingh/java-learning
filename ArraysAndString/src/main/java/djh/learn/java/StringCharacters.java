package djh.learn.java;

public class StringCharacters {
    public static void main(String[] args) {
        String str = "Hello";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
            System.out.println(str.indexOf("l"));
            System.out.println(str.lastIndexOf("l"));
        }
    }
}
