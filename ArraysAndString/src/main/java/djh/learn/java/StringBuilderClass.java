package djh.learn.java;

public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Welcome to java");
        System.out.println(builder);
        builder.insert(2,"Djh");
        System.out.println(builder);
        builder.delete(2,5);
        System.out.println(builder);
        builder.setCharAt(2,'L');
        System.out.println(builder);
        builder.append("Resaons");
        System.out.println(builder);
        System.out.println(builder.substring(4,12));
    }
}
