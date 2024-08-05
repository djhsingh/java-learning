package djh.learn.java19;

import java.time.LocalDate;

public class TheDates {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalDate lastSixthMonth = date.minusMonths(6);
        System.out.println(lastSixthMonth);
    }
}
