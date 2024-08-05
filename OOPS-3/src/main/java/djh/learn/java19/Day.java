package djh.learn.java19;

public enum Day {
    MONDAY(10),
    TUESDAY(20),
    WEDNESDAY(30),
    THRUSDAY(40),
    FRIDAY(50),
    SATURDAY(60),
    SUNDAY(70);

    int CURRENT_VALUE;

    Day(int val){
        this.CURRENT_VALUE=val;
    }

    @Override
    public String toString() {
        return "Day{" +
                "CURRENT_VALUE=" + CURRENT_VALUE +
                '}';
    }
}
