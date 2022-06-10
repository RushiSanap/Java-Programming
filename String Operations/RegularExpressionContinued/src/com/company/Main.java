package com.company;

public class Main {

    public static void main(String[] args) {
        String str5 = "$";
        System.out.println(str5.matches("\\w"));//character or digits or underscore
        System.out.println(str5.matches("\\W"));//neither digit nor character

        System.out.println(str5.matches("\\d"));//digits
        System.out.println(str5.matches("\\D"));//not digits

        System.out.println(str5.matches("\\s"));//spaces
        System.out.println(str5.matches("\\S"));//not spaces
    }
}
