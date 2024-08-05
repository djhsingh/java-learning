package djh.learn.java19;

public class StaticBlock {
    public static void main(String[] args) {
        System.out.println(Lady.counter);
        Lady lady = new Lady();
        System.out.println(Lady.counter);
        Lady.counter+=10;
        System.out.println(Lady.counter);
    }
}
