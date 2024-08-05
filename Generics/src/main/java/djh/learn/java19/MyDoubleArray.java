package djh.learn.java19;

public class MyDoubleArray {
    private Double[] array;

    public MyDoubleArray(Double[] array) {
        this.array = array;
    }

    public Double[] getArray() {
        return array;
    }

    public Double getElement(int idx) {
        return array[idx];
    }
    public void setArray(Double[] array) {
        this.array = array;
    }
}
