package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        long a = 0, b = 1, c;
        Scanner scan = new Scanner(System.in);

        int num;
        System.out.print("Enter the number of terms of the fibonacci series: ");
        num = scan.nextInt();

        System.out.println("Fibonacci Series");
        System.out.println(a);
        System.out.println(b);
        int i = 0;

        while(i < num - 2)
        {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
            i++;
        }

    }
}
