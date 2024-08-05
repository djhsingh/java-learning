package djh.learn.java19.classes;

public class Calculator {

    public void add(int... numbers){
        int total =0;
        for (int i:numbers) {
            total +=i;
        }
        System.out.println(total);
    }
    public void add(int a, int b){
        System.out.println(a+b);
    }
    public void add(int a, int b,int c){
        System.out.println(a+b+c);
    }
    public void add(double a, double b){
        System.out.println(a+b);
    }
    public void add(double a, double b,double c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(4,5);
        calculator.add(4,5,6);
        calculator.add(4,5,6,7,8,9,10);
        calculator.add(40.5,50.5);
        calculator.add(40.5,50,34.5);
    }
}
