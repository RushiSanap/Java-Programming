package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int rows1,columns1,rows2,columns2;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of rows of matrix A:");
        rows1 = scan.nextInt();

        System.out.print("Enter the number of columns of matrix A:");
        columns1 = scan.nextInt();

        System.out.print("Enter the number of rows of matrix B:");
        rows2 = scan.nextInt();

        System.out.print("Enter the number of columns of matrix B:");
        columns2 = scan.nextInt();

        int A[][] = new int[10][10];
        int B[][] = new int[10][10];
        int C[][] = new int[10][10];

        System.out.println("Enter elements of matrix A:");
        for(int i = 0; i < rows1; i++)
            for(int j = 0; j < columns1; j++)
                A[i][j] = scan.nextInt();

        System.out.println("Enter elements of matrix B:");
        for(int i = 0; i < rows2; i++)
            for(int j = 0; j < columns2; j++)
                B[i][j] = scan.nextInt();

        System.out.println("Matrix A");
        for(int i = 0; i < rows1; i++)
        {
            System.out.print("[");
            for (int j = 0; j < columns1; j++)
            {
                System.out.print(A[i][j] + " ");
            }
            System.out.println("]");
        }

        System.out.println("Matrix B");
        for(int i = 0; i < rows2; i++)
        {
            System.out.print("[");
            for (int j = 0; j < columns2; j++)
            {
                System.out.print(B[i][j] + " ");
            }
            System.out.println("]");
        }

        if(rows1 == columns1 && rows2 == columns2)
        {
            for(int i = 0; i < rows1; i++)
            {
                for(int j = 0; j < columns2; j++)
                {
                    C[i][j] = A[i][j] + B[i][j];
                }
            }
            System.out.println("Result of Addition of matrix A and B");
            for(int i = 0; i < rows1; i++)
            {
                System.out.print("[");
                for (int j = 0; j < columns2; j++)
                {
                    System.out.print(C[i][j] + " ");
                }
                System.out.println("]");
            }
        }
        else
            System.out.println("Multiplication does not exist");

    }
}
