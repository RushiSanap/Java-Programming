package com.company;

import java.util.Scanner;
//pattern
/*
          *
        * *
      * * *
    * * * *
  * * * * *

 */

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
                if(i+j <= n)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println("");
        }
    }
}

