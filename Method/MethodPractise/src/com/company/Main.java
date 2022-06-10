package com.company;

public class Main {

    static void update(int A[],int index, int value)
    {
        A[index] = value;
    }
    public static void main(String[] args) {
        int A[] = {1,2,3,4,5};
        System.out.println(A[2]);
        update(A,2,50);
        System.out.println(A[2]);
    }
}
