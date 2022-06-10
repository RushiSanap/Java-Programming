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

        int n = 6; //number of elements in an array

        int key, index;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number: ");
        key = scan.nextInt();

        System.out.print("Enter the index: ");
        index = scan.nextInt();

        for(int i = 0; i < n; i++)
        {
            System.out.print(A[i] + " ");
        }

        int temp2 = A[index];

        for(int i = n ; i >= index + 1 ; i--)
        {
            A[i] = A[i - 1];
        }

        A[index] = key;

        System.out.println("\nArray After Insertion");
        for(int i = 0; i < n + 1; i++)
        {
            System.out.print(A[i] + " ");
        }

    }
}
