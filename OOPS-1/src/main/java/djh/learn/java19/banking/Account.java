package djh.learn.java19.banking;

public class Account {

    public double balance;

    private double rent;

    String type;

    protected boolean isAdult;

    private void setRent(){
        rent=4444;
    }

    void setType(){
        type="Saving";
    }

    void setAdult(){
        isAdult=true;
    }
}
