package com.company;

import java.util.Scanner;
//pattern
/*
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *

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
                {
                    for(int k = 1; k < 2*i; k++)
                    {
                        System.out.print("* ");
                    }
                    break;
                }

            }
            System.out.println("");
        }
        for(int i = 1; i <= n - 1; i++)
        {
            for(int j = 1; j <= n - 1; j++)
            {
                while(j <= i)
                {
                    System.out.print("  ");
                    j++;
                }
                for(int k = 1; k < 2*(n-i); k++)
                {
                    System.out.print("* ");
                }
                break;
            }
            System.out.println("");
        }

    }
}
