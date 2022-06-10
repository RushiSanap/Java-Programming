package com.company;

public class Main {

    public static void main(String[] args) {
	    int x = 10;
	    int y = -10;

	    System.out.printf("%5d hello\n", x);//number is written in 5 spaces
        System.out.printf("%-5d hello\n", x);//number is written in 5 spaces
        System.out.printf("%05d\n", x);//number is written in 5 spaces are filled with 0's
        System.out.printf("%(5d\n", y);//if the number is negative then number is written in brackets otherwise same as 1st statement
        System.out.printf("%+d\n", x);//number are written with their signs
        System.out.printf("%+d\n", y);//number are written with their signs

        float t = 123.45960490f, d = 3.45f;
        System.out.printf("%6.2f\n", t);
        System.out.printf("%06.2f\n", d);

        String str = "Java";
        System.out.printf("%20s\n", str);
        System.out.printf("%-20s", str);


    }
}
