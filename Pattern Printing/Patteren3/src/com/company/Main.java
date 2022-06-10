package com.company;

import java.util.Scanner;
//pattern
/*   2  3  4  5  6
     3  4  5  6  7
     4  5  6  7  8
     5  6  7  8  9
     6  7  8  9 10 */

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
                System.out.format("%2d ", (i  + j));
            }
            System.out.println("");
        }
    }
}
