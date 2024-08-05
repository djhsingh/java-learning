package djh.learn.java19;

public class MyStringArray {
    private String[] array;

    public MyStringArray(String[] array) {
        this.array = array;
    }

    public String[] getArray() {
        return array;
    }

    public String getElement(int idx) {
        return array[idx];
    }
    public void setArray(String[] array) {
        this.array = array;
    }
}
