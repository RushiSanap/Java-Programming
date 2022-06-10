package com.company;

class Outer
{
    static int x = 10;
    int y = 20;

    static class Inner
    {
        public void display()
        {
            int z = 10;
            System.out.println("Value of x = " + x);
            System.out.println("Value of z = " + z);
            //System.out.println("Value of y = " + y);
            //cannot be accessed not static member functions of the class
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Outer.Inner i = new Outer.Inner();
        i.display();
    }
}
