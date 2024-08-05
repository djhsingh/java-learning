package djh.learn.java19;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class LocalDatePart1 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalDate hiredDate = LocalDate.of(1993, Month.MAY,12);
        System.out.println(hiredDate);
        System.out.println(hiredDate.getDayOfWeek());
        LocalDate hiredDate2 = LocalDate.of(1994, Month.SEPTEMBER,23);
        System.out.println(hiredDate2);
        System.out.println(hiredDate2.getDayOfWeek());
        System.out.println("------------");

        LocalDate futureDate = LocalDate.parse("2027-12-27");
        System.out.println(futureDate);
        System.out.println(hiredDate.get(ChronoField.MONTH_OF_YEAR));
        System.out.println(hiredDate.get(ChronoField.DAY_OF_WEEK));
    }
}
