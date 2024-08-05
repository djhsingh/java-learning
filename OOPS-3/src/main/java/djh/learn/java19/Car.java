package djh.learn.java19;

public class Car implements CarRemote,OpenTank{
    @Override
    public void openDoor() {
        System.out.println("opening the Door");
    }

    @Override
    public void openTank() {
        System.out.println("Opening the Tank");
    }

    @Override
    public void openAllDoors() {
        CarRemote.super.openAllDoors();
        System.out.println("opening car doors");
    }
}
