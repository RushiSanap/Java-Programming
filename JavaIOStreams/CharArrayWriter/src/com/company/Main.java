package com.company;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        CharArrayWriter car = new CharArrayWriter(20);
        car.write('a');
        car.write('b');
        car.write('c');
        car.write('d');
        String str = new String(car.toCharArray());
        System.out.println(str);
        car.close();


    }
}
