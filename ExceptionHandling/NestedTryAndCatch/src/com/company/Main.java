package com.company;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        int A[] = {10,0,30,50,60};
        try
        {
            int c = A[0]/A[1];
            System.out.println("Division is " + c);

            try
            {
                System.out.println(A[7]);
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Exception is " + e);
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception is " + e);
        }

        System.out.println("Bye");
    }
}
