package com.company;

public class Main {

    static int reverse(int x)
    {
        int rev = 0;
        while(x>0)
        {
            int y = x%10;
            rev = rev*10 + y;
            x = x/10;
        }
        return rev;
    }

    static void reverse(int A[], int size)
    {
        for(int i = 0, j = size - 1; i < (size - 1)/2; i++, j--)
        {
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
    }

    public static void main(String[] args) {
        int A[] = {2,3,4,5,6,7,1};
        int x = 34365;
        System.out.println(reverse(x));
        reverse(A,A.length);
        for(int z:A)
            System.out.print(z + " ");

    }
}
