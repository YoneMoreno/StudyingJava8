package Time;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class InstantExample {
    public static void main(String[] args) {

        Instant now = getInstantNow(Instant.now());

        Instant oneHourLater = getInstantNow(now.plus(1, ChronoUnit.HOURS));

        getMinutesOfDifference(oneHourLater);

        convertInstantToLocalDateTime(now);

        Duration elapsed = getDuration(now, oneHourLater);

        elapsedTimeMinutes(elapsed);

        addWeekTo(now);

        getSecondsBetween(now, oneHourLater);


    }

    private static void getSecondsBetween(Instant now, Instant oneHourLater) {
        long secondsBetween = ChronoUnit.SECONDS.between(oneHourLater, now);
        System.out.println("Una semana tiene: " + secondsBetween + " segundos");
    }

    private static void addWeekTo(Instant now) {
        Duration week = Duration.ofDays(7);
        Instant nowPlusWeek = now.plus(week);
        System.out.println(nowPlusWeek);
    }

    private static void elapsedTimeMinutes(Duration elapsed) {
        long minutesElapsed = elapsed.toMinutes();
        System.out.println(minutesElapsed);
    }

    private static Duration getDuration(Instant now, Instant oneHourLater) {
        return Duration.between(oneHourLater, now);
    }

    private static void convertInstantToLocalDateTime(Instant now) {
        LocalDateTime localDateTime = LocalDateTime.ofInstant(now, ZoneId.systemDefault());
        System.out.printf("%d %s %d a las %d:%d%n", localDateTime.getYear(),
                localDateTime.getMonth(),
                localDateTime.getDayOfMonth(),
                localDateTime.getHour(),
                localDateTime.getMinute());
    }

    private static void getMinutesOfDifference(Instant oneHourLater) {
        long minutes = Instant.now().until(oneHourLater, ChronoUnit.MINUTES);
        System.out.println(minutes);
    }

    private static Instant getInstantNow(Instant now2) {
        Instant now = now2;
        System.out.println(now);
        return now;
    }
}
