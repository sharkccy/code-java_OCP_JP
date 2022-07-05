package javaapplication3;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class JavaApplication3 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2019, Month.JANUARY, 20);

        System.out.println(date.getDayOfWeek());
        System.out.println(date.getMonth());
        System.out.println(date.getYear());
        System.out.println(date.getDayOfYear());

        DateTimeFormatter df = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(df.format(date));
    }

}
