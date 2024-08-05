package djh.learn.java;

public class TypeInference {
    public static void main(String[] args) {
        int myInt = 56;
        char myChar = 'A';
        var myVariable = 34;
        System.out.println(myInt);
        System.out.println(myChar);
        System.out.println(myVariable);

        var myVariable2 = 'A';
        System.out.println(myVariable2);
    }
}
