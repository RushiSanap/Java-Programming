package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int A[] = {18,76,2,3,9,5,65,23,12,45};
        int sum = 0;

        //sum of all all elements of an array
        for(int i = 0; i < A.length; i++)
        {
            sum += A[i];
        }
        System.out.println("Sum = " + sum);

        //searching for an element
        int search = 65, flag = 0, j = 0;
        for(int i = 0; i < A.length; i++)
        {
            if(search == A[i])
            {
                flag = 1;
                j = i;
                break;
            }
        }
        if(flag == 1)
            System.out.println("Element is Found at index " + j);
        else
            System.out.println("Elements is not found");

        //finding largest element of an array
        int max = A[0];
        j = 0;
        int B[] = new int[10];
        for(int  i = 1; i < A.length; i++)
        {
            if(A[i] > max)
            {
                max = A[i];
                j = i;
            }

            else
                continue;
        }
        System.out.println("Max Element = " + max);



        //finding first and second largest number in an array
        int max1, max2;
        max2 = max1 = Integer.MIN_VALUE;
        for(int  i = 0; i < A.length; i++)
        {
            if(A[i] > max1)
            {
                max2 = max1;
                max1 = A[i];
            }
            else if(A[i] > max2)
            {
                max2 = A[i];
            }
        }
        System.out.println("largest Element = " + max1);
        System.out.println("Second largest Element = " + max2);

        /*finding second largest element of an array
        int secondMax;

        if(j == 0)
            secondMax = A[1];
        else
            secondMax = A[0];

        for(int  i = 0; i < A.length; i++)
        {
            if(A[i] > secondMax && i != j)
            {
                secondMax = A[i];
            }

            else
                continue;
        }
        System.out.println("Second largest Element = " + secondMax);*/


    }
}