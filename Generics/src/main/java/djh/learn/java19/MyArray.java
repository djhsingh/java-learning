package djh.learn.java19;

public class MyArray<T> {
    T[] array;

    public MyArray(T[] array) {
        this.array = array;
    }

    public  <T> boolean isGreaterThan(MyArray<T> otherArray){
        return this.array.length > otherArray.array.length;
    }

    public static void main(String[] args) {
        MyArray<String> stringMyArray1 = new MyArray<>(new String[]{"hello","raj","hai"});
        MyArray<String> stringMyArray2 = new MyArray<>(new String[]{"hello","raj","hai","okk"});
        System.out.println(stringMyArray1.isGreaterThan(stringMyArray2));
        MyArray<Integer> integerMyArray = new MyArray<>(new Integer[]{2,4,5,6,6,7});
        System.out.println(stringMyArray1.isGreaterThan(integerMyArray));
    }
}
