package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 15;
        Integer b = Integer.valueOf(a);
        Integer c = 15;
        Integer d = Integer.valueOf("101010", 2);
        String str = Integer.toBinaryString('a');
        System.out.println(str);
    }
}
