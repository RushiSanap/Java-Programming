package com.company;

import java.util.Scanner;
//even or odd
public class Main {

    public static void main(String[] args) {
	    int x;
	    Scanner s = new Scanner(System.in);
        System.out.print("Enter a number:");
	    x = s.nextInt();
	    if(x%2 == 0)
        {
            System.out.println(x + " is an even number");
        }
        else
        {
            System.out.println(x + " is an odd number");
        }

    }
}
