package com.company;
//swapping using bitwise operation
public class Main {

    public static void main(String[] args) {
	    int x = 9, y = 12;

        System.out.println("x = " + x + " y = " + y);

	    x = x ^ y;
	    y = x ^ y;
	    x = x ^ y;

	    System.out.println("x = " + x + " y = " + y);
    }
}
