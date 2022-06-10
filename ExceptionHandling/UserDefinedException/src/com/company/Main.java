package com.company;

class NegativeDimensionException extends Exception
{
    @Override
    public String toString()
    {
        return "Dimensions of a rectangle Cannot be negative";
    }
}

public class Main {
    static int area(int l, int b) throws NegativeDimensionException
    {
        if(l < 0 || b < 0)
            throw new NegativeDimensionException();

        int a = l*b;

        return a;
    }

    static void meth1() throws NegativeDimensionException
    {
        int a = area(-10,5);
        System.out.println(a);
    }

    static void meth2()
    {
        try
        {
            meth1();
        }
        catch (NegativeDimensionException e)
        {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        meth2();
    }
}
