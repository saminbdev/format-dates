package com.pluralsight;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter merica = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(now.format(merica));

        DateTimeFormatter iso = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(now.format(iso));

        DateTimeFormatter longFormat = DateTimeFormatter.ofPattern("EEEE, MMMM dd,yyyy ");
        System.out.println(now.format(longFormat));

        ZonedDateTime gmtNow = ZonedDateTime.now(ZoneId.of("GMT"));
        DateTimeFormatter gmtFormat = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy HH:mm");
        System.out.println(gmtNow.format(gmtFormat));

        DateTimeFormatter challenge = DateTimeFormatter.ofPattern("h:nn 'on' dd-MM-yyyy");
        System.out.println(now.format(challenge));
    }

}
