package com.company;
//format specifiers in java
//for integer d,o,x
//for float f,e,g
//for string s
public class Main {

    public static void main(String[] args) {
	    int x = 124;
	    float y = 0.0012345f;
	    String str = "Hello java programming!!!";
	    System.out.printf("x = %d\n", x);
        System.out.printf("octal = %o\n", x);
	    System.out.printf("hexadecimal = %x\n", x);
        System.out.printf("y = %f\n", y);
        System.out.printf("Scientific representation = %e\n", y);
        System.out.printf("%s\n", str);
        System.out.printf("%1$d %1$d %2$f", x, y);

    }
}
