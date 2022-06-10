package com.company;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class Main {

    public static void main(String[] args) {
        ZonedDateTime dt = ZonedDateTime.now();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss z Z");
        System.out.println(dt.format(dtf));

        System.out.println(dt.get(ChronoField.HOUR_OF_DAY));


    }
}
