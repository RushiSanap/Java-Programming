package com.company;

abstract class Super
{
    public Super()
    {
        System.out.println("Super Constructor");
    }

    public void method1()
    {
        System.out.println("Super method 1");
    }

    abstract public void method2();
}

class Sub extends Super
{
    @Override
    public void method2()
    {
        System.out.println("Sub method 2");
    }
}

//we cannot create the objects of abstract classes
//we can create the variable  or reference of abstract classes
public class Main {

    public static void main(String[] args) {
        Super s = new Sub();
        s.method1();
        s.method2();
    }
}
