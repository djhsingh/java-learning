package djh.learn.java19;

public class Human {
    static int counter;

    static{
        counter=6;
    }

    void walk(){
        System.out.println("Human are Walking....");
    }
    static void print(){
        //local class  //class with a name and inside a method
        class StringFormat{
            void format(){
                System.out.println("Formatting a String");
            }
        }
        System.out.println(counter);
    }
    //non-static inner class
    class Read{
        void readBook(){
            System.out.println("Reading a Book");
        }
    }//static inner class
    static class Study{
        void study(){
            System.out.println("Studing for Exam");
        }
    }
}
