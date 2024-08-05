package djh.learn.java19.wildCard;

public class Printer<T> {
    void print(Printer<? extends Employee> obj){
        System.out.println("Name of the class is "+obj.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        Printer<Tester> employeePrinter = new Printer<>();
        employeePrinter.print(new Printer<Tester>());
    }
}
