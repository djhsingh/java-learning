package djh.learn.java19;

import java.time.*;
import java.time.temporal.ChronoField;

public class InstantClass {
    public static void main(String[] args) {
        System.out.println(Instant.now());
        System.out.println(Instant.now().getEpochSecond());

        System.out.println(ZoneId.getAvailableZoneIds());

        System.out.println(Instant.now().atZone(ZoneId.of("Asia/Calcutta")));
        System.out.println(ZoneId.systemDefault());
        System.out.println(ZonedDateTime.now());
        System.out.println(ZonedDateTime.now(ZoneId.of("Asia/Dhaka")));
        System.out.println(ZonedDateTime.now(ZoneId.of("Asia/Tokyo")));
        System.out.println(OffsetDateTime.now());
        System.out.println(OffsetDateTime.now(ZoneId.of("Asia/Tokyo")));
    }
}
