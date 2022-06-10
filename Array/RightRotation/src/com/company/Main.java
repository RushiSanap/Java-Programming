package com.company;

public class Main {

    public static void main(String[] args) {
        //right rotation of an array
        int B[] = {2,3,4,1,8,9};
        for(int x : B)
        {
            System.out.print(x + " ");
        }
        int temp1 = B[B.length - 1];
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
