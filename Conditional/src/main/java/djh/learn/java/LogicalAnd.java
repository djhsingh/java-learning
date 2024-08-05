package djh.learn.java;

public class LogicalAnd {
    public static void main(String[] args) {

        if(true && true){
            System.out.println("Block true && true Executed");
        }
        if(false && true){
            System.out.println("Block false && true Executed");
        }
        if(true && false){
            System.out.println("Block true && false Executed");
        }
        if(false && false){
            System.out.println("Block false && false Executed");
        }
    }
}
