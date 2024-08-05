package djh.learn.java19;

public class GenericMethods {
    public static void main(String[] args) {

    getType(45);
    getType("Raj");
    getType(false);
    getType("raj",45);
    System.out.println(areEqual("raj",45));
    System.out.println(areEqual("raj","amit"));
    System.out.println(areEqual("raj","raj"));
    }

    public static <T> void getType(T data){
        System.out.println(data.getClass().getSimpleName());
    }

    public static <T,U> void getType(T data1,U data2){
        System.out.println(data1+" is of type "+data1.getClass().getSimpleName());
        System.out.println(data2+" is of type "+data2.getClass().getSimpleName());
    }

    public static <T,U> boolean areEqual(T data1,U data2){
        return data1.equals(data2);
    }
}
