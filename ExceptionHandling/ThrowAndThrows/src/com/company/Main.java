package com.company;

public class Main {
    static int area(int l, int b) throws Exception
    {
        if(l < 0 || b < 0)
            throw new Exception("Dimension Cannot be negative");

        int a = l*b;

        return a;
    }

    static void meth1() throws Exception
    {
        int a = area(10,-5);
        System.out.println(a);
    }

    static void meth2()
    {
        try
        {
            meth1();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        meth2();
    }
}
