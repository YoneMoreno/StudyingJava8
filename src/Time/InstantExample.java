package Time;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalUnit;

public class InstantExample {
    public static void main(String[] args) {

        Instant now = Instant.now();
        System.out.println(now);

        Instant oneHourLater = now.plus(1, ChronoUnit.HOURS);
        System.out.println(oneHourLater);

        long minutes = Instant.now().until(oneHourLater, ChronoUnit.MINUTES);
        System.out.println(minutes);

        LocalDateTime localDateTime = LocalDateTime.ofInstant(now, ZoneId.systemDefault());
        System.out.printf("%d %s %d a las %d:%d%n", localDateTime.getYear(),
                localDateTime.getMonth(),
                localDateTime.getDayOfMonth(),
                localDateTime.getHour(),
                localDateTime.getMinute());

    }
}
