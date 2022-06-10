package com.company;

import java.util.Scanner;
//printing multiplication table
public class Main {

    public static void main(String[] args) {
	    int num;
	    Scanner scan = new Scanner(System.in);

	    System.out.print("Enter number: ");
	    num = scan.nextInt();

	    for(int i = 1; i <= 10; i++)
        {
            System.out.println(num + "x" + i + " = " + num*i);
        }
    }
}
