package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int x, y, z;
	    Scanner s = new Scanner(System.in);
	    System.out.println("Enter Three numbers");
	    x = s.nextInt();
	    y = s.nextInt();
	    z = s.nextInt();
	    if(x > y && x > z)
        {
            System.out.println(x + " is the largest number");
        }
	    else if(y > z)
        {
            System.out.println(y + " is the largest number");

        }
	    else
        {
            System.out.println(z + " is the largest number");

        }
    }
}
