package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date d = new Date();

        System.out.println(d);//date and timing

        System.out.println(d.getTime());//time in milliseconds

        System.out.println(d.getDate());

        System.out.println(d.getDay());

        System.out.println(d.getMonth());

        System.out.println(d.getYear() + 1900);
    }
}
