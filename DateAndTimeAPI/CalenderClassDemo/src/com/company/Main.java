package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Main {

    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();

        boolean r = gc.isLeapYear(2020);
        System.out.println(r);

        System.out.println(gc.get(Calendar.DATE));
        System.out.println(gc.get(Calendar.MONTH));
        System.out.println(gc.get(Calendar.DAY_OF_WEEK));

        TimeZone tz = gc.getTimeZone();
        System.out.println(tz);
    }
}
