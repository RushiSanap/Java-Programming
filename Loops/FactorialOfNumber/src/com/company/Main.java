package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number: ");
        num = scan.nextInt();
        int prod = 1;
        for(int i = 1; i <= num; i++)
        {
            prod = prod*i;
        }
        System.out.print("Factorial of " + num + " = " + prod);
    }
}
