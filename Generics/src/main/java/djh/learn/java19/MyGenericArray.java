package djh.learn.java19;

public class MyGenericArray<T> {
    private T[] array;

    public MyGenericArray(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public T getElement(int idx) {
        return array[idx];
    }
    public void setArray(T[] array) {
        this.array = array;
    }
}
