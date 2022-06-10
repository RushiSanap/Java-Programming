package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float s1,s2,s3,p,area;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the sides of triangle");
        s1 = s.nextFloat();
        s2 = s.nextFloat();
        s3 = s.nextFloat();
        p = (s1+s2+s3)/2f;
        area = (float) Math.sqrt(p*(p-s1)*(p-s2)*(p-s3));
        System.out.println("Area of the triangle is " + area);

    }
}
