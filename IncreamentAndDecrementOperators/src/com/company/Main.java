package com.company;

public class Main {

    public static void main(String[] args) {
    	char a = 'A';
    	a++;
	    int x = 5, y = 4, z;
	    z = 2*++x + x++;
	    System.out.println(x + " " + y + " " + z);
	    System.out.println(a);
    }
}
