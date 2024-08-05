package djh.learn.java19;

public class StaticMethods {

    static int age;
    String name="Deepak";
    static {
        age=30;
    }

    void print(){
        this.name="Ajay";
        System.out.println("age is "+age);
        System.out.println("name is "+name);
    }
    static void staticMethod(){
    //    this.name="Ram";
        System.out.println("age is "+age);
    }

    public static void main(String[] args) {
        StaticMethods methods = new StaticMethods();
        methods.print();
        System.out.println(methods.name);
        StaticMethods.staticMethod();
        staticMethod();
    }
}
