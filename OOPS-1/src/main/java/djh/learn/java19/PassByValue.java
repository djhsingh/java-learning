package djh.learn.java19;

public class PassByValue {

    public void changeInteger(Integer x){
        x+=Integer.valueOf(99);
        System.out.println(x);
    }
    public void changeInt(int x){
        x+=99;
        System.out.println(x);
    }
    public static void main(String[] args) {
        int x = 1;
        System.out.println(x);
        PassByValue obj = new PassByValue();
        obj.changeInt(x);
        System.out.println(x);

        Integer value = 45;
        System.out.println(value);
        obj.changeInteger(value);
        System.out.println(value);
    }
}
