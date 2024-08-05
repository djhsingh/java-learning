package djh.learn.java19;

interface MinMaxInterface<T extends Number> {
    T min(T x,T y);
    T max(T x,T y);
}

public class MinMaxClass2 implements MinMax<Double>{
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


class MinMaxClass3 implements MinMaxInterface<Integer>{
    @Override
    public Integer min(Integer x, Integer y) {
        return Math.min(x,y);
    }

    @Override
    public Integer max(Integer x, Integer y) {
        return Math.max(x,y);
    }

    public static void main(String[] args) {
        MinMaxClass3 minMaxClass = new MinMaxClass3();
        System.out.println(minMaxClass.min(45,32));
        System.out.println(minMaxClass.max(45,32));
    }
}