package utils;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateUtils {
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public static String formatLocalDate(LocalDate localDate) {
        if (localDate == null) {
            return null;
        }
        return formatter.format(localDate);
    }

    public static LocalDate parseStrLocalDate(String strLocalDate) throws DateTimeParseException {
        return LocalDate.parse(strLocalDate, formatter);
    }
    public static boolean isDateInRange(LocalDate date, LocalDate startDate, LocalDate endDate) {
        return date.isAfter(startDate) && date.isBefore(endDate);
    }

    public static String formatInstant(Instant instant) {
        if (instant == null) {
            return null;
        }
        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.systemDefault());
        LocalDate localDate = zonedDateTime.toLocalDate();
        return formatter.format(localDate);
    }

    public static Instant parseStrInstant(String strInstant) throws DateTimeParseException {
        LocalDate localDate = LocalDate.parse(strInstant, formatter);
        ZonedDateTime zonedDateTime = localDate.atStartOfDay(ZoneId.systemDefault());
        return zonedDateTime.toInstant();
    }

    public static boolean isInstantInRange(Instant instant, Instant startInstant, Instant endInstant) {
        LocalDate date = instant.atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate startDate = startInstant.atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate endDate = endInstant.atZone(ZoneId.systemDefault()).toLocalDate();
        return date.isAfter(startDate) && date.isBefore(endDate);
    }
}
