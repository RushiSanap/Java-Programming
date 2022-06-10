package com.company;

import java.util.Scanner;
//pattern
/*1 1 1 1 1
  2 2 2 2 2
  3 3 3 3 3
  4 4 4 4 4
  5 5 5 5 5 */

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
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
}