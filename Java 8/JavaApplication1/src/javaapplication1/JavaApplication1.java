package javaapplication1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class JavaApplication1 {

    public static void main(String[] args) {
        System.out.println(LocalDate.now());  // 只顯示日期

        System.out.println(LocalTime.now());  // 只顯示時間

        System.out.println(LocalDateTime.now());  // 顯示日期時間

        LocalDate date = LocalDate.of(2018, Month.SEPTEMBER, 21);
        System.out.println(date);

        date = date.plusDays(2);
        System.out.println(date);

        date = date.plusWeeks(1);
        System.out.println(date);

        date = date.plusYears(2);
        System.out.println(date);
    }

}
