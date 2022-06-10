package com.company;

public class Main {

    public static void main(String[] args) {
        //possible declaration of an arrau
        int A[] = new int[10];

        int B[] = {1,2,3,4,5};

        int[] C = new int[10];

        int []D = new int [10];

        int E[];
        E = new int[10];

        for(int i = 0; i < B.length; i++)
        {
            System.out.print(B[i]++ + " ");
        }
        System.out.println("");
        for(int x : B)
        {
            System.out.print(x + " ");
        }
    }
}
