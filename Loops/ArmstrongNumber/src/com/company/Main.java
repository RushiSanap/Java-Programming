package com.company;

import java.util.Scanner;
//armstrong number
public class Main {

    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number: ");
        num = scan.nextInt();
        int sum = 0;
        int temp = num;
        while (num > 0)
        {
            int x = num %10;
            sum = sum + (int)Math.pow(x, 3);
            num = num/10;
        }
        if(sum == temp)
            System.out.println(temp + " is an armstrong number");
        else
            System.out.println(temp + " is not an armstrong number");
    }
}
