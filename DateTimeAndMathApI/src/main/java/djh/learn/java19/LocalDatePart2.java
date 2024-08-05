package djh.learn.java19;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDatePart2 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalDate hiredDate = LocalDate.of(1993, Month.MAY,12);
        System.out.println(hiredDate);
        System.out.println(hiredDate.getDayOfWeek());
        LocalDate hiredDate2 = LocalDate.of(1994, Month.SEPTEMBER,23);
        System.out.println(hiredDate2);
        System.out.println(hiredDate2.isAfter(hiredDate));
        System.out.println(hiredDate2.isBefore(hiredDate));

        LocalDateTime localDateTime = localDate.atTime(11,22);
        System.out.println(localDateTime);

        LocalDate localDate1 = localDate.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(localDate1);

        Period period = Period.between(hiredDate,hiredDate2);
        System.out.println(period);
        System.out.println(period.getDays());
        System.out.println(period.getYears());
        System.out.println(period.getMonths());

        LocalDate myDate = hiredDate2.minusYears(hiredDate.getYear()).minusMonths(hiredDate.getMonthValue())
                .minusDays(hiredDate.getDayOfYear());
        System.out.println(myDate);

    }
}
