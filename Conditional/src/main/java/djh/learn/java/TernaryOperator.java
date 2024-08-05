package djh.learn.java;

public class TernaryOperator {
    public static void main(String[] args) {
        int grade = 7;
        String status = "";
        if (grade > 5) {
            status = "Succeed";
        } else {
            status = "Failed";
        }
        System.out.println(status);
        status = (grade > 5) ? "Succeed" : "Failed";
        System.out.println(status);
    }
}
