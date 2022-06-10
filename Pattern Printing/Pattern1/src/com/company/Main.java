package com.company;

import java.util.Scanner;
//pattern
/*1 2 3 4 5
  1 2 3 4 5
  1 2 3 4 5
  1 2 3 4 5
  1 2 3 4 5*/

public class Main {

    public static void main(String[] args) {
        int n;
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Enter number: ");
	    n = scan.nextInt();
	    for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
