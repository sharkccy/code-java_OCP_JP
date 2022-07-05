package javaapplication2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class JavaApplication2 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2018, 10, 10);
        LocalTime time = LocalTime.of(6, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(dateTime);

        Period period = Period.ofMonths(1);
        System.out.println(date.plus(period));

        System.out.println(dateTime.plus(period));

        //System.out.println(time.plus(period));  Error
    }

}
