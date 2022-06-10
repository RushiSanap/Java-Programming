package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        num = scan.nextInt();
        String str = "";
        int count =0, i;
        while(num > 0)
        {
            int x = num%10;
            str = str + x;
            num = num/10;
        }

        for(i = str.length() - 1; i >= 0; i--)
        {
            char c = str.charAt(i);
            switch (c)
            {
                case '1':System.out.print("one ");
                    break;
                case '2':System.out.print("two ");
                    break;
                case '3':System.out.print("three ");
                    break;
                case '4':System.out.print("four ");
                    break;
                case '5':System.out.print("five ");
                    break;
                case '6':System.out.print("six ");
                    break;
                case '7':System.out.print("seven ");
                    break;
                case '8':System.out.print("eight ");
                    break;
                case '9':System.out.print("nine ");
                    break;
                case '0':System.out.print("zero ");
                    break;
            }

        }


    }
}
