package djh.learn.java19;

interface MyFace{
    void test(String name);
}


public class MethodReference {
    public static void sayHello(String name){
        System.out.println("hello..... "+name);
    }
    public static void main(String[] args) {
        MyFace myFace = (str)-> System.out.println(str);
        myFace.test("Okkkkkkkkkkkk");
        MyFace myRef = System.out::println;
        myRef.test("Ooye....");
        MyFace theFace = MethodReference::sayHello;
        theFace.test("Deepak Singh Jangra");
    }
}
