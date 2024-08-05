package djh.learn.java19;

public class Rectangle {
    private int length,breadth;
    public Rectangle(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public Rectangle(){
        this(5,6);
    }

    int getArea(){
        return this.length*this.breadth;
    }
    int getParameter(){
        return 2*(this.length+this.breadth);
    }

    void printAreaAndParameter(){
        System.out.println("Area is "+this.getArea());
        System.out.println("Parameter is "+this.getParameter());
    }
}
