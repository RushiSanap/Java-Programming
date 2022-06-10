package com.company;

import java.util.Scanner;
//arithmetic series
public class Main {

    public static void main(String[] args) {

        int commonDifference, firstNumber, num;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number of the AP: ");
        firstNumber = scan.nextInt();

        System.out.print("Enter common difference of the AP: ");
        commonDifference = scan.nextInt();

        System.out.print("Enter the required number of terms of the AP: ");
        num = scan.nextInt();

        //arithmetic series
        int term = firstNumber;
        for(int i = 1; i <= num; i++)
        {
            //int t = firstNumber + (i - 1)*commonDifference;
            //System.out.print(t + " ");
            System.out.print(term + " ");
            term = term + commonDifference;
        }

        int commonRatio;
        System.out.print("\nEnter first number of the GP: ");
        firstNumber = scan.nextInt();

        System.out.print("Enter common ratio of the GP: ");
        commonRatio = scan.nextInt();

        System.out.print("Enter the required number of terms of the GP: ");
        num = scan.nextInt();
        //geometric series
        term = firstNumber;
        for(int i = 1; i <= num; i++)
        {
            //int t = firstNumber*(int)Math.pow(commonRatio, i-1);
            //System.out.print(t + " ");
            System.out.print(term + " ");
            term = term*commonRatio;
        }
    }
}
