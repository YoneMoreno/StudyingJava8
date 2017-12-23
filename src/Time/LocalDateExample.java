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
