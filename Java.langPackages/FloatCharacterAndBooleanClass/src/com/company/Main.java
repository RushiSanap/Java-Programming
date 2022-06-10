package com.company;

public class Main {

    public static void main(String[] args) {

        float a = 12.4f;
        Float b = 12.4f;
        //System.out.println(b.equals(a));

        Float c = 12.4f/0;
        //System.out.println(c == Float.POSITIVE_INFINITY);
        //System.out.println(c == Float.NEGATIVE_INFINITY);

        Float d = (float)Math.sqrt(-1);
        System.out.println(d.isNaN());

        //alternative method for checking not a number
        //working opposite of above method
        Float f = (float)Math.sqrt(-1);
        System.out.println(f == Float.NaN);

        Float e = 12.4f/0;
        System.out.println(e.isInfinite());



    }
}
