package djh.learn.java19;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new CheckingBankAccount();
        System.out.println(account.getInterest());
        BankAccount checkAccount = new CheckingBankAccount();
        System.out.println(checkAccount.getInterest());

        BankAccount savingAccount = new SavingBankAccount();
        System.out.println(savingAccount.getInterest());

        CarRemote carRemote = new Car();
        CarRemote.staticMethod();

        carRemote.openDoor();

        Car car = new Car();
        car.openTank();
        car.openDoor();
        System.out.println(car.MAX_VALUE);
        car.openAllDoors();
    }
}