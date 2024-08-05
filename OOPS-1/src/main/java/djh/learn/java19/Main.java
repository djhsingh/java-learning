package djh.learn.java19;

import djh.learn.java19.classes.Person;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Person ajay = new Person();
        ajay.firstName="Ajay";
        ajay.lastName="jangra";
        System.out.println(ajay.firstName+" "+ajay.lastName);
        System.out.println(ajay.hashCode());
        ajay.walk();
        System.out.println(ajay.fullName());
        ajay.eat("rice");
    }
}