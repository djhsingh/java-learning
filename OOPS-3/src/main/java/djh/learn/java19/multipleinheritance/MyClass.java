package djh.learn.java19.multipleinheritance;

public class MyClass implements MyInterface{
    @Override
    public void myMethod() {
        System.out.println("My Method");
    }

    @Override
    public void firstMethod() {
        System.out.println("First Method");
    }

    @Override
    public void secondMethod() {
        System.out.println("Second Method");
    }
}
