package djh.learn.java19;

public class PassByReference {

    public void changeArray(int[] x){
        x[0]=99;
        x[1]=99;
        x[2]=99;
        for (int i:x) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] array = {1,1,1};
        for (int i:array) {
            System.out.println(i);
        }
        System.out.println("passing to function");
        PassByReference obj = new PassByReference();
        obj.changeArray(array);
        System.out.println("After changing value");
        for (int i:array) {
            System.out.println(i);
        }
    }
}
