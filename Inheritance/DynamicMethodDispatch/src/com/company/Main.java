package com.company;

class Super
{
    protected int x;

    public void method1()
    {
        System.out.println("Super meth1");
    }

    public void method2()
    {
        System.out.println("Super meth2");
    }
}

class Sub extends Super
{
    @Override
    public void method2()
    {
        System.out.println("sub meth2");
    }

    public void method3()
    {
        System.out.println("sub meth3");
    }
}

public class Main {

    public static void main(String[] args) {
        Super s = new Super();
        s.method1();
        s.method2();

        Sub sb = new Sub();
        sb.method2();
        sb.method3();

        Super sp = new Sub();
        sp.method2();
    }
}
