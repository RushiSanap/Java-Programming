package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        num = scan.nextInt();
        int count =0, i = 0;
        int arr[] = new int[10];
        while(num > 0)
        {
            int x = num%10;
            arr[i++] = x;
            count++;
            num = num/10;
        }

        i = count - 1;

        while(i >= 0)
        {
            switch (arr[i])
            {
                case 1:System.out.print("one ");
                    break;
                case 2:System.out.print("two ");
                    break;
                case 3:System.out.print("three ");
                    break;
                case 4:System.out.print("four ");
                    break;
                case 5:System.out.print("five ");
                    break;
                case 6:System.out.print("six ");
                    break;
                case 7:System.out.print("seven ");
                    break;
                case 8:System.out.print("eight ");
                    break;
                case 9:System.out.print("nine ");
                    break;
                case 0:System.out.print("zero ");
                    break;
            }
            i--;

        }


    }
}
