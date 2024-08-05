package djh.learn.java19.classes;

public class Constructors {
    public static void main(String[] args) {
     //   Car car = new Car();
        Car newcar = new Car("red");
        System.out.println(newcar.color);
        Car oldcar = new Car("red",2008);
        System.out.println(oldcar.color+"   "+oldcar.year);

    }
}
