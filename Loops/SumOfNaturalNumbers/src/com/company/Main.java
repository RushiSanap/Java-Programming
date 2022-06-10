package com.company;

import java.util.Scanner;
//sum of first n natural numbers
public class Main {

    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number: ");
        num = scan.nextInt();
        int sum = 0;
        for(int i = 1; i <= num; i++)
        {
            sum = sum + i;
        }
        System.out.print("Sum of first " + num + " natural numbers = " + sum);
    }
}
