package com.company;

import java.lang.annotation.*;

@Retention(RetentionPolicy.CLASS)
@Documented
@Target(value = ElementType.FIELD)

@ interface MyAnno
{
    String name();
    String projects();
    String date();
    String version() default "16.0.3";
}

public class Main {

    @MyAnno(name = "Rushi", projects = "Bank", date = "12/12/2020")
    static int data = 12;

    static void display() {
        System.out.println(data);
    }

    public static void main( String[] args) {
        int x;
    }
}
