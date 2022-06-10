package com.company;

public class Main {

    int max(int A[],int size)
    {
        int max = A[0];
        for(int i = 1; i < size; i++)
        {
            if(A[i] > max)
                max = A[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int B[] = {3,6,7,9,2,3};
        Main maxele = new Main();
        System.out.println("Max element of an array is " + maxele.max(B, B.length));
    }
}
