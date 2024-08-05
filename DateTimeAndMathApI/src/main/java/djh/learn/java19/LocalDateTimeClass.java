package djh.learn.java19;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;

public class LocalDateTimeClass {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDate localDate = localDateTime.toLocalDate();
        System.out.println(localDate);
        LocalTime localTime = localDateTime.toLocalTime();
        System.out.println(localTime);

        String format = localDateTime.format(DateTimeFormatter.ISO_DATE);
        System.out.println(format);
        String pattern = localDateTime.format(DateTimeFormatter.ofPattern("E, yyyy-MMMM-dd hh:mm a"));
        System.out.println(pattern);

    }
}
