package com.company;

public class Main {

    public static void main(String[] args) {
	    byte x = 9, y = 12;
	    byte z;

	    z = (byte)(x<<4);
	    z = (byte)(z|y);

	    System.out.println((0b11110000 & z) >> 4);
        System.out.println((0b00001111 & z));
    }
}
