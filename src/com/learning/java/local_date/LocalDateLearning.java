package com.learning.java.local_date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Locale;

/**
 * Created by Augmentis on 6/10/2017.
 */
public class LocalDateLearning {
    private static final int CHECK = 4;


    public static void main(String[] args) {
        switch (CHECK) {
            case 0:
                dateExampleOne();
                break;
            case 1:
                dateExampleTwo();
                break;
            case 2:
                dateExampleThree();
                break;
            case 3:
                dateExampleFour();
                break;
            case 4:
                dateExampleFive();
                break;
        }
    }

    private static void dateExampleFive() {
        LocalTime t1 = LocalTime.of(23, 01, 44);
        System.out.println("Local Time " + t1);

        LocalTime t2 = LocalTime.parse("23:50:33");
        System.out.println("Local Time Two : " + t2);
    }

    private static void dateExampleOne() {
        LocalDate date = LocalDate.of(2017, 5, 23);
        System.out.println("Date " + date);
        System.out.println("Month " + date.getMonth());
        System.out.println("Year " + date.getYear());

        LocalDate fullMonth = LocalDate.of(2017, Month.DECEMBER, 23);
        System.out.println("Full Month " + fullMonth);
    }

    private static void dateExampleTwo() {
        LocalDate date = LocalDate.now();
        System.out.println("Current Date " + date);

        LocalDate tenYears = date.plus(1, ChronoUnit.DECADES);
        System.out.println("Ten Years " + tenYears);

        LocalDate fiveYesrs = date.plus(5, ChronoUnit.YEARS);
        System.out.println("Five Years " + fiveYesrs);

        LocalDate lastMonth = date.minus(1, ChronoUnit.MONTHS);
        System.out.println("Last Months " + lastMonth);

        LocalDate TwoWeeks = date.plus(2, ChronoUnit.WEEKS);
        System.out.println("Two Weeks " + TwoWeeks);
    }

    private static void dateExampleThree() {
        LocalDate date = LocalDate.now();
        CustomFormatDate(date, "d/M/yyyy");
        CustomFormatDate(date, "M/d/yyyy");
        CustomFormatDate(date, "dd/MM/yyyy");
        CustomFormatDate(date, "dd MMM, yyyy");
        CustomFormatDate(date, "dd MMMM, yyyy");
        CustomFormatDate(date, "EEEE, dd MMMM, yyyy");

    }

    private static void CustomFormatDate(Temporal t, String pt) {
        DateTimeFormatter dft = DateTimeFormatter.ofPattern(pt, Locale.forLanguageTag("th-TH"));
        String str = dft.format(t);
        System.out.println(pt + " : " + str);
    }

    private static void dateExampleFour() {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current Date Time " + dateTime);

        LocalDate ld = dateTime.toLocalDate();
        System.out.println("Local Date Time " + ld);
    }
}
