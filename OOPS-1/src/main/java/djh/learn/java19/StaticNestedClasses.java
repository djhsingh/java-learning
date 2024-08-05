package djh.learn.java19;

public class StaticNestedClasses {

    public static void main(String[] args) {
        Human human = new Human();
        human.walk();
        Human.print();
        Human.Read read = human.new Read();
        read.readBook();
        Human.Study stud = new Human.Study();
        stud.study();
        /*//normal method invocation
        Human human2 = new Human();
        human2.walk();*/
        //annonymous class
        Human annonymousPerson = new Human(){
            @Override
            void walk() {
                System.out.println("Walking in Store");
            }
        };
        annonymousPerson.walk();

    }

}
