package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int A[] = new int[10];

        A[0] = 2;
        A[1] = 3;
        A[2] = 6;
        A[3] = 9;
        A[4] = 4;
        A[5] = 10;

        int n = 6;


        int key, index;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the index of an element to be deleted: ");
        index = scan.nextInt();

        for(int i = 0; i < n; i++)
        {
            System.out.print(A[i] + " ");
        }

        for(int i = index + 1; i < n ; i++)
        {
            A[i - 1] = A[i];
        }

        System.out.println("\nArray After Deletion");

        for(int i = 0; i < n-1; i++)
        {
            System.out.print(A[i] + " ");
        }

    }
}

