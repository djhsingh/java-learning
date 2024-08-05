package djh.learn.java19;

public class Lady {
    static int counter;

    static {
        counter = 8;
        System.out.println("SB-1");
    }
    static {
        counter=100;
        System.out.println("SB-2");
    }
    public Lady(){
        counter=5;
        System.out.println("Constructor");
    }
}
