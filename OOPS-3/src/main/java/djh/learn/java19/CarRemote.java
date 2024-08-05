package djh.learn.java19;

public interface CarRemote {
    //all fields are by default public , static , final
    //methods by defult are public and abstract
    int MAX_VALUE = Integer.MAX_VALUE;

    private void logErrors(){
        System.out.println("Showing Errors");
    }

    static void staticMethod(){
        System.out.println("Static Methods");
    }

    void openDoor();

    default void openAllDoors() {
        System.out.println("Opening all the doors");
    }
}

interface OpenTank{
    void openTank();
}