package Util;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
   public static String current() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd//HH/mm/ss");
        String formattedDateTime = now.format(formatter);
        return formattedDateTime;
    }
}