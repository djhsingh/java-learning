package djh.learn.java;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Welcome to java ";
        System.out.println(str.getBytes(StandardCharsets.UTF_8));
        System.out.println(str.getBytes());
        System.out.println(str.toLowerCase(Locale.ROOT));
        System.out.println(str.toLowerCase());
        System.out.println(str.isBlank());
        System.out.println(str.isEmpty());
        System.out.println(str.trim());
        System.out.println(str.startsWith("W"));
    }
}
