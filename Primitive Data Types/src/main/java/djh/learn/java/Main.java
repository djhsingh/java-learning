package djh.learn.java;

public class Main {
    //instance variable
    int myAge = 45;

    //static /class variable
    static int salary = 90000;
    //local variable
    public static void main(String[] args) {

        int age; //declared variable of type int,variable name is age;
        age = 30; //variable assignment

        int myAge = 37;

        //case sensitive
        int mySecondAge = 23;//camel case
        int _age = 45; //underscore is allowed
        int $age= 34;//dollar is allowed

        System.out.println(age);
    }

}