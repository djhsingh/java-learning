package djh.learn.java19;

public class MyIntegerArray {
    private Integer[] array;

    public MyIntegerArray(Integer[] array) {
        this.array = array;
    }

    public Integer[] getArray() {
        return array;
    }

    public Integer getElement(int idx) {
        return array[idx];
    }
    public void setArray(Integer[] array) {
        this.array = array;
    }
}
