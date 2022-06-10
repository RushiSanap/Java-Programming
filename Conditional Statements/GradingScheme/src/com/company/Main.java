package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int m1, m2, m3;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the marks of three subjects:");
        m1 = s.nextInt();
        m2 = s.nextInt();
        m3 = s.nextInt();

        float avg = (float)(m1 + m2 + m3)/3;

        if(avg >= 70)
        {
            System.out.print("A grade");
        }
        else if(avg >= 60 && avg < 70)
        {
            System.out.print("B grade");
        }
        else if(avg >= 50 && avg < 60)
        {
            System.out.print("C grade");
        }
        else if(avg >= 40 && avg < 50)
        {
            System.out.print("D grade");
        }
        else
        {
            System.out.print("F grade");
        }

    }
}
