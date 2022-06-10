package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int A[] = {2,3,4,5,0,9,7,-1};
        int key, location;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        key = scan.nextInt();
        System.out.print("Enter the location: ");
        location = scan.nextInt();
        int temp2 = A[location - 1];
        /*for(int i = location - 1 ; i < A.length - 1; i++)
        {
            int temp1 = A[i + 1];
            A[i + 1] = temp2;
            temp2 = temp1;
        }
        A[location -1] = key;
        for(int x : A)
        {
            System.out.print(x + " ");
        }*/
        for(int i = A.length - 2; i >= location - 1 ; i--)
        {
            A[i + 1] = A[i];
        }
        A[location -1] = key;
        for(int x : A)
        {
            System.out.println(x);
        }

    }
}
