package utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {

    public static String todayDate() {
        return LocalDate.now().format(DateTimeFormatter.ofPattern(
                "dd.MM.uuuu"));
    }

    public static String todayDateTime() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd.MM.uuuu HH:mm:ss"));
    }

}
