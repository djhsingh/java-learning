package djh.learn.java19;

interface MinMaxInter<T extends Comparable<T>> {
    T min(T x,T y);
    T max(T x,T y);
}

public class MinMaxClazz implements MinMaxInter<Double>{
    @Override
    public Double min(Double x, Double y) {
        return Math.min(x,y);
    }

    @Override
    public Double max(Double x, Double y) {
        return Math.max(x,y);
    }

    public static void main(String[] args) {
        MinMaxClass2 minMaxClass = new MinMaxClass2();
        System.out.println(minMaxClass.min(45.3,32.1));
        System.out.println(minMaxClass.max(45.3,32.1));

    }

}


class Employee implements Comparable<Employee>{
    int yrsOfExp;

    @Override
    public int compareTo(Employee o) {
        if(this.yrsOfExp == o.yrsOfExp){
            return 0;
        } else if(this.yrsOfExp > o.yrsOfExp){
            return 1;
        } else{
            return -1;
        }
    }
}

