package djh.learn.java19;

public class StaticExample {
    public static void main(String[] args) {
        Person john = new Person("john");
        System.out.println(john.name);
        john.counter++;
        Person.counter++;
        System.out.println(john.counter);
        Person tom = new Person("tom");
        tom.counter++;
        Person.counter++;
        System.out.println(tom.name);

        System.out.println(tom.counter);

    }
}
