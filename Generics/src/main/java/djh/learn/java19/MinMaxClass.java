package djh.learn.java19;

public class MinMaxClass implements MinMax<Double>{
    @Override
    public Double min(Double x, Double y) {
        return Math.min(x,y);
    }

    @Override
    public Double max(Double x, Double y) {
        return Math.max(x,y);
    }

    public static void main(String[] args) {
        MinMaxClass minMaxClass = new MinMaxClass();
        System.out.println(minMaxClass.min(45.3,32.1));
        System.out.println(minMaxClass.max(45.3,32.1));
    }
}
