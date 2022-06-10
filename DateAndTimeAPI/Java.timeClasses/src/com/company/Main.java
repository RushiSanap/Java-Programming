package com.company;

import com.sun.source.tree.InstanceOfTree;

import java.time.*;

public class Main {

    public static void main(String[] args) {
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);

        OffsetDateTime odt = OffsetDateTime.now();
        System.out.println(odt);

        ZonedDateTime zdt1 = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(zdt1);

        MonthDay md = MonthDay.now();
        System.out.println(md);

        Period p = Period.of(10, 10, 3);
        Instant i = Instant.now();

    }
}
