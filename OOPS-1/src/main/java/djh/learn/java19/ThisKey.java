package djh.learn.java19;

public class ThisKey {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4,6);
        System.out.println(rectangle);
        System.out.println(rectangle.hashCode());
        rectangle.printAreaAndParameter();
    }
}
