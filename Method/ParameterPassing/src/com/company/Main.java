package com.company;

import java.util.Locale;

public class Main {
    static int add(int x, int y)
    {
        int z;
        z = x + y;
        return z;
    }

    static void welcome(String s)
    {
        s = s.toUpperCase();
        System.out.println(s);
    }

    public static void main(String[] args) {
        //no separate parameter passing methods are in java like c or cpp
        int a = 10, b = 5, c;
        c = a + b;
        System.out.println(c);
        String name = "Rushikesh";
        welcome(name);
        System.out.println(name);
    }
}
