package djh.learn.java19.package2;

import djh.learn.java19.package1.Parent;

public class Child extends Parent {
    public Child() {
        //super();
        System.out.println("Child default Constructor");
    }

    @Override
    public void print() {
        super.print();
        System.out.println("child Printing...");
    }
}
