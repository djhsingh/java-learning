package djh.learn.java19;

import djh.learn.java19.multipleinheritance.SecondInterface;

public abstract class Shape {
    abstract void print();

    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        System.out.println(rectangle instanceof Rectangle);
        System.out.println(rectangle instanceof Shape);
        Shape circle = new Circle();
        System.out.println(circle instanceof Circle);
        System.out.println(circle instanceof Rectangle);
        System.out.println(circle instanceof Shape);

        Shape.invokeClass(new Rectangle());
        Shape.invokeClass(new Circle());
    }

    static void invokeClass(Shape shape){
        if(shape instanceof Rectangle){
            shape= new Rectangle();
            shape.print();
        } else{
            shape = new Circle();
            shape.print();
        }
    }
}

class Rectangle extends Circle{

    @Override
    void print() {
        System.out.println("Rectangle");
    }
}

class Circle extends Shape{

    @Override
    void print() {
        System.out.println("Circle");
    }
}
