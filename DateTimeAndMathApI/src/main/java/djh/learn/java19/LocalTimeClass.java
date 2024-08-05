package djh.learn.java19;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeClass {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        System.out.println(localTime.getHour()+":"+localTime.getMinute()+":"+localTime.getSecond()+":"+localTime.get(ChronoField.AMPM_OF_DAY));
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }
}
