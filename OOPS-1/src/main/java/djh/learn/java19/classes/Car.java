package djh.learn.java19.classes;

public class Car {
    String color;
    int year;
   /* public Car() {
        System.out.println("No args Constructor");
    }*/
    /*private Car() {
        System.out.println("No args Constructor");
    }*/

    public Car(String color) {
        this.color = color;
        System.out.println("In parameterized constructor");
    }

    public Car(String color, int year) {
        this.color = color;
        this.year = year;
        System.out.println("In two parameters Constructor");
    }
}
