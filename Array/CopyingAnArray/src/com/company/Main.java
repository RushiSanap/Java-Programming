package com.company;

public class Main {

    public static void main(String[] args) {
	    int A[] = {1,4,5,6,7,8};
	    int B[] = new int[10], i = 0;
	    int C[] = new int[10];
	    for(i = 0; i < A.length; i++)
        {
            B[i] = A[i];
            C[A.length - i - 1] = A[i];
        }

	    //copying of an array
	    for(int j =0; j < i; j++)
        {
            System.out.print(B[j] + " ");
        }

	    //reversing of an array
        System.out.println("");
        for(int j =0; j < i; j++)
        {
            System.out.print(C[j] + " ");
        }
    }
}
