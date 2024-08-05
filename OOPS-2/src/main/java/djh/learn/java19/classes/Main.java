package djh.learn.java19.classes;

import djh.learn.java19.classes.Accountant;
import djh.learn.java19.package1.Parent;
import djh.learn.java19.package2.Child;

public class Main {
    public static void main(String[] args) {

       // Accountant accountant = new Accountant();
        Employee accountant = new Accountant();
        Employee engineer = new Engineer();
        Employee manager = new Manager();

        /*Child child  = new Child();
        child.print();*/


        Parent child  = new Child();
        child.print();
    }
}