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
        System.out.println("");
        //right rotation of an array
        int B[] = {2,3,4,1,8,9};
        for(int x : B)
        {
            System.out.print(x + " ");
        }
        temp1 = B[B.length - 1];
        for(int i = B.length - 1; i >= 1 ; i--)
        {
            B[i] = B[i - 1];
        }
        B[0] = temp1;
        System.out.println("");
        for(int x : B)
        {
            System.out.print(x + " ");
        }
    }
}
