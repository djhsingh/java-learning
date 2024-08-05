package djh.learn.java19.custom;

public class BankAccount {
    public static double depozitMoney(double money) throws WrongAmountException, OrganizedWrongAmountException {
        double balance=300000;
        if(money==0){
            throw new WrongAmountException("Money can't be in zero");
        } else if(money <0){
            throw new OrganizedWrongAmountException(OrganizedWrongAmountException.ErrorCode.NEGATIVE_AMOUNT);
        } else {
            balance+=money;
        }
        return balance;
    }
}