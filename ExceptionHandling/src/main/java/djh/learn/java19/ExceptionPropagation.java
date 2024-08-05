package djh.learn.java19;

/** Method propagation from main method to the exact line
 * Exception in thread "main" java.lang.ArithmeticException: / by zero
 * 	at djh.learn.java19.ExceptionPropagation.methodC(ExceptionPropagation.java:13)
 * 	at djh.learn.java19.ExceptionPropagation.methodB(ExceptionPropagation.java:9)
 * 	at djh.learn.java19.ExceptionPropagation.methodA(ExceptionPropagation.java:5)
 * 	at djh.learn.java19.ExceptionPropagation.main(ExceptionPropagation.java:17)
 */
public class ExceptionPropagation {
    static void methodA() {
        methodB();
    }

   static void methodB() {
        methodC();
    }

    static void methodC() {
        System.out.println(10/0);
    }

    public static void main(String[] args) {
        methodA();
    }
}


