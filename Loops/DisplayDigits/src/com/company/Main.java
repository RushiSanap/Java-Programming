package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number: ");
        num = scan.nextInt();
        int temp = num;
        //displaying digits of the number
        int arr[] = new int[10];
        int i = 0, count = 0;
        while(num > 0)
        {
            int x = num % 10;
            arr[i++] = x;
            count++;
            num = num / 10;
        }

        //displaying the digits of the number
        System.out.println("Digits of the number");
        for(i=count - 1; i >= 0; i--)
        {
            System.out.print(arr[i] + " ");
        }

        ////counting the digits of the number
        System.out.println("\nTotal digits in a number = " + count);


        //displaying the number in reverse order
        int sum = 0, tCount = count - 1;
        for(i=0; i < count; i++)
        {
            sum = sum + arr[i]*(int)Math.pow(10, tCount);
            tCount--;
        }
        System.out.print("Number in reverse order = " + sum);


        //palindrome number
        if(temp == sum)
            System.out.println("\npalindrome number");
        else
            System.out.println("\nNot a palindrome number");
    }
}
