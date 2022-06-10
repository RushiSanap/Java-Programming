package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int choice;
	    System.out.println("********SIMPLE CALCULATOR********");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Square");
        System.out.println("6.Square root");
        System.out.println("*********************************\n");

        float x,y,z;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the choice of the operation:");
        choice = scan.nextInt();
        switch (choice)
        {
            case 1:
                System.out.print("Enter first number: ");
                x = scan.nextFloat();
                System.out.print("Enter second number: ");
                y = scan.nextFloat();
                System.out.print("Addition = " + (x + y));
                break;
            case 2:
                System.out.print("Enter first number: ");
                x = scan.nextFloat();
                System.out.print("Enter second number: ");
                y = scan.nextFloat();
                System.out.print("Subtraction = " + (x - y));
                break;
            case 3:
                System.out.print("Enter first number: ");
                x = scan.nextFloat();
                System.out.print("Enter second number: ");
                y = scan.nextFloat();
                System.out.print("Multiplication = " + (x * y));
                break;
            case 4:
                System.out.print("Enter first number: ");
                x = scan.nextFloat();
                System.out.print("Enter second number: ");
                y = scan.nextFloat();
                System.out.print("Division = " + ((float)x/y));
                break;
            case 5:
                System.out.print("Enter number: ");
                x = scan.nextFloat();
                System.out.print("Square = " + (x * x));
                break;
            case 6:
                System.out.print("Enter number: ");
                x = scan.nextFloat();
                System.out.print("Square root = " + (float)Math.sqrt(x));
                break;
            default:System.out.println("Please enter the correct choice");
                break;
        }
    }
}
