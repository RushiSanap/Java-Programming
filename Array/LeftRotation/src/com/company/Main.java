package com.company;

public class Main {

    public static void main(String[] args) {
        //left rotation of array
        int A[] = {2,3,4,5,0,9,7};
        int temp1 = A[0];

        for(int x : A)
        {
            System.out.print(x + " ");
        }

        System.out.println("");

        for(int i = 1; i < A.length; i++)
        {
            A[i - 1] = A[i];
        }

        A[A.length - 1] = temp1;

        for(int x : A)
        {
            System.out.print(x + " ");
        }
    }
}
