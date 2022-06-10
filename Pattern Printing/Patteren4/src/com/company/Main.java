package com.company;

import java.util.Scanner;
//pattern
/*  01 02 03 04 05
    06 07 08 09 10
    11 12 13 14 15
    16 17 18 19 20
    21 22 23 24 25*/

public class Main {

    public static void main(String[] args) {
        int n, count = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        n = scan.nextInt();
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                System.out.format("%02d ", ++count);
            }
            System.out.println("");
        }
    }
}

