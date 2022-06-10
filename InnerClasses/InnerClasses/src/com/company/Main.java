package com.company;

class Outer
{
    int x = 10;

    class Inner
    {
        int y = 20;

        public void displayInner()
        {
            System.out.println("Value of x = " + x);
            System.out.println("Value of y = " + y);
        }
    }

    public void displayOuter()
    {
        Inner i = new Inner();
        i.displayInner();
        System.out.println("Value of y = " + i.y);
    }

}

public class Main
{
    public static void main(String[] args)
    {
        Outer.Inner oi = new Outer().new Inner();
        oi.displayInner();

    }
}