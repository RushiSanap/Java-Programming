package com.company;

public class Main {

    public static void main(String[] args) {
        //gives absolute number
        System.out.print("Absolute number:");
        System.out.println(Math.abs(-123));

        System.out.print("Absolute number:");
        System.out.println(StrictMath.abs(-123));

        //square root
        System.out.print("Square root:");
        System.out.println(Math.sqrt(9));

        //cube root
        System.out.print("Cube root:");
        System.out.println(Math.cbrt(27));

        //power of a number
        System.out.print("2 power 3:");
        System.out.println(Math.pow(2,7.9));

        //exact decrement
        int i = Integer.MIN_VALUE;
        System.out.println("Before decrement:" + i);
        i--;
        System.out.println("After decrement:" + i);

        System.out.print("Exact decrement:");
        System.out.println(Math.decrementExact(6));

        //degree to radians
        System.out.print("Degree to Radian:");
        System.out.println(Math.toRadians(90));

        //Radian to Degree
        System.out.print("Degree to Radian:");
        System.out.println(Math.toDegrees(1));

        //sine trigonometric functions
        System.out.print("Sine 90 Degree:");
        System.out.println(Math.sin(Math.toRadians(90)));

        //cosine trigonometric functions
        System.out.print("Cosine 60 Degree:");
        System.out.println(Math.cos(Math.toRadians(60)));

        //inverse trigonometric functions
        //sine trigonometric functions
        //angle is in radian
        System.out.print("tan inverse of 1:");
        System.out.println(Math.toDegrees(Math.atan(1)));

        //round division
        System.out.print("Round Division to floor:");
        System.out.println(Math.floorDiv(10,4));

        System.out.print("e power x:");
        System.out.println(Math.exp(3));

        System.out.print("log to base 10:");
        System.out.println(Math.log10(5));

        System.out.print("log to the base e:");
        System.out.println(Math.log(5));

        System.out.print("Random:");
        System.out.println(Math.random()*1000);









    }
}
