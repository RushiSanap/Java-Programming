package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int a, b, c;
	    float x1, x2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coefficient of x^2 ");
        a = sc.nextInt();
        System.out.println("Enter the coefficient of x ");
        b = sc.nextInt();
        System.out.println("Enter the constant term ");
        c = sc.nextInt();
        x1 = (float)(-b + Math.sqrt(b*b - 4*a*c))/(2*a);
        x2 = (float)(-b - Math.sqrt(b*b - 4*a*c))/(2*a);
        System.out.println("Roots of the quadratic equation are " + x1 + " and " + x2);
    }
}
