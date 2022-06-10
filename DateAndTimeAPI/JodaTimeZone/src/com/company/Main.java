package com.company;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        LocalDate dt = LocalDate.now(Clock.systemDefaultZone());
        System.out.println(dt);

        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
    }
}
