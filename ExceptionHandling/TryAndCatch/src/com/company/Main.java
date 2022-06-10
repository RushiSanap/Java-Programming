package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a , b ;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a = ");
        a = scan.nextInt();

        System.out.print("Enter b = ");
        b = scan.nextInt();

        try
        {
            int c = a/b;
            System.out.println(c);
        }

        catch (ArithmeticException e)
        {
            System.out.println("Denominator should not be 0, try again");
            System.out.println("Exception is " + e);
        }

        System.out.println("Bye");
    }
}
