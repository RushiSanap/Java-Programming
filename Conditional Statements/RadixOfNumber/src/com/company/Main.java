package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String str;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        str = s.nextLine();
        if(str.matches("[01]+"))
        {
            System.out.println("Binary Radix = 2");
        }
        else if(str.matches("[0-7]+"))
        {
            System.out.println("Octal Radix = 8");
        }
        else if(str.matches("[0-9]+"))
        {
            System.out.println("Decimal Radix = 10");
        }
        else if(str.matches("[0-9A-F]+"))
        {
            System.out.println("Hexade Radix = 16");
        }
        else
        {
            System.out.println("number is invalid");
        }
    }
}
