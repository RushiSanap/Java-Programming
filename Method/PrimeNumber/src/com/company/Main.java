package com.company;

public class Main {
    //checking the prime numbers using methods
    static boolean isPrime(int x)
    {
        int flag = 0;
        for(int i = 2; i < x/2; i++)
        {
            if(x%i == 0)
            {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        int x = 21;
        if(isPrime(x))
            System.out.println(x + " is a prime number");
        else
            System.out.println(x + " is not a prime number");

    }
}
