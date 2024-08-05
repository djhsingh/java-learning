package djh.learn.java19.mathApI;

public class MathClass {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.max(4,6));
        System.out.println(Math.min(4,6));
        System.out.println(Math.addExact(4,6));
        System.out.println(Math.subtractExact(4,6));
        System.out.println(Math.multiplyExact(4,6));
        System.out.println(Math.sqrt(36));
        System.out.println(Math.cbrt(64));
        System.out.println(Math.decrementExact(5));
        System.out.println(Math.abs(49.5));
        System.out.println(Math.ceil(49.5));
        System.out.println(Math.floor(49.5));
        System.out.println(Math.round(49.5));
        System.out.println(Math.round(49.2));
        System.out.println(Math.copySign(-4,3));


        System.out.println("-----------------");
        System.out.println(Math.random());
        System.out.println(((Math.random()+1)/10)+1);
    }
}
