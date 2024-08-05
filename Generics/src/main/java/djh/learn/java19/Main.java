package djh.learn.java19;

public class Main {
    public static void main(String[] args) {
        Double [] doubles = {5.4,6.5,3.2,8.2};
        MyDoubleArray myDoubleArray = new MyDoubleArray(doubles);
        System.out.println(myDoubleArray.getElement(3));

        Object[] objects ={"String",45,242.2,false};
        MyObjectArray myObjectArray = new MyObjectArray(objects);
        System.out.println(myObjectArray.getElement(3));

        MyGenericArray<Double> doubleMyGenericArray = new MyGenericArray<>(doubles);
        System.out.println(doubleMyGenericArray.getElement(2));

        MyGenericArray<Object> objectMyGenericArray = new MyGenericArray<>(objects);
        System.out.println(objectMyGenericArray.getElement(1));


        MyArray<String> stringMyArray1 = new MyArray<>(new String[]{"hello","raj","hai"});
        MyArray<String> stringMyArray2 = new MyArray<>(new String[]{"hello","raj","hai","okk"});
        System.out.println(stringMyArray1.isGreaterThan(stringMyArray2));
        MyArray<Integer> integerMyArray = new MyArray<>(new Integer[]{2,4});
        System.out.println(stringMyArray1.isGreaterThan(integerMyArray));
    }
}