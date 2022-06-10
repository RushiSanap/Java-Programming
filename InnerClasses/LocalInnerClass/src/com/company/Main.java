package com.company;

class Outer
{
    public void display()
    {
        //class defined inside the method of main class
        //useful only inside the method
        //cannot access outside the method
        class LocalInner
        {
            public void display()
            {
                System.out.println("Hello World");
            }
        }
        LocalInner l = new LocalInner();
        l.display();
        new LocalInner().display();
    }
}

public class Main {

    public static void main(String[] args) {
        Outer o = new Outer();
        o.display();
    }
}
