package Time;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate cumple = LocalDate.of(1996, Month.NOVEMBER, 14);

        Period between = getPeriod(now, cumple);
        long daysBetween = getDaysBetween(now, cumple);
        printYears(between, daysBetween);


        LocalDate siguienteCumple = cumple.withYear(now.getYear());

        siguienteCumple = checkIfBirthdayHasBeenThisYear(now, siguienteCumple);

        Period period = getPeriod(siguienteCumple, now);
        long daysBetweenDates = getDaysBetween(siguienteCumple, now);
        printTimeToNextYearInfo(period, daysBetweenDates);

    }

    private static void printTimeToNextYearInfo(Period period, long daysBetweenDates) {
        System.out.println("Quedan " + period.getMonths() + " meses, y " +
                period.getDays() + " días hasta tu siguiente cumpleaños. (" +
                daysBetweenDates + " días en total)");
    }

    private static LocalDate checkIfBirthdayHasBeenThisYear(LocalDate now, LocalDate siguienteCumple) {
        if (hasBirthdayBeenThisYear(now, siguienteCumple)) {
            siguienteCumple = addYearTo(siguienteCumple);
        }
        return siguienteCumple;
    }

    private static LocalDate addYearTo(LocalDate siguienteCumple) {
        siguienteCumple = siguienteCumple.plusYears(1);
        return siguienteCumple;
    }

    private static boolean hasBirthdayBeenThisYear(LocalDate now, LocalDate siguienteCumple) {
        return siguienteCumple.isBefore(now) || siguienteCumple.isEqual(now);
    }

    private static void printYears(Period between, long daysBetween) {
        System.out.println("Tienes " + between.getYears() + " años, "
                + between.getMonths() + " meses,"
                + between.getDays() + " días. ("
                + daysBetween + " días en total");
    }

    private static long getDaysBetween(LocalDate now, LocalDate cumple) {
        return ChronoUnit.DAYS.between(cumple, now);
    }

    private static Period getPeriod(LocalDate now, LocalDate cumple) {
        return Period.between(cumple, now);
    }
}
