package djh.learn.java19.custom;

public class OrganizedWrongAmountException extends Exception{

    private ErrorCode errorCode;
    public OrganizedWrongAmountException(ErrorCode errorCode){
        super();
        this.errorCode=errorCode;
    }

    @Override
    public String toString() {
        return "Error Occured: "+this.errorCode;
    }

    enum ErrorCode{
        ZERO_AMOUNT(1002) {
            @Override
            public String toString() {
                return "Amount you Entered is Zero (:. Error Code is: "+ZERO_AMOUNT.errorNumber;
            }
        },
        NEGATIVE_AMOUNT(1004){
            @Override
            public String toString() {
                return "Amount you Entered is Negative/Less than zero (:. Error Code is: "+NEGATIVE_AMOUNT.errorNumber;
            }
        };

       private int errorNumber;

       ErrorCode(int errorNumber){
            this.errorNumber=errorNumber;
        }
    }
}
