package djh.learn.java19;

public class MyObjectArray {
    private Object[] array;

    public MyObjectArray(Object[] array) {
        this.array = array;
    }

    public Object[] getArray() {
        return array;
    }

    public Object getElement(int idx) {
        return array[idx];
    }
    public void setArray(Object[] array) {
        this.array = array;
    }
}
