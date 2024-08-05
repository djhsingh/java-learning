package djh.learn.java19.examples;

public class Emain {
    static void print(Calculator calculator,double x, double y){
        double res = calculator.calc(x,y);
        System.out.println("result is "+res);
    }


    static void filter(Filter filter , int[] arr){
        for(int n:arr){
            if(filter.filter(n)){
                System.out.print(n+", ");
            }
        }
    }
    public static void main(String[] args) {
        Calculator add = (x,y)->x+y;
        print(add,5,6);
        Calculator sub = (x,y)->x-y;
        print(sub,5,6);

        print((x,y)->x-y,6,3);
        /*Calculator mul = (x,y)->x*y;
        print(mul,5,6);
        Calculator div = (x,y)->x/y;
        print(div,5,6);
        Calculator mod = (x,y)->x%y;
        print(mod,5,6);*/

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        Filter filter = (n)-> n%2==0;
        filter(filter,arr);
        System.out.println("\n----");
        filter((n)->n%3==0,arr);
    }
}
