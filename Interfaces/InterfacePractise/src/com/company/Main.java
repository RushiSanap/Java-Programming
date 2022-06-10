package com.company;

import javax.swing.text.TabExpander;

interface Test1
{
    void meth1();

    void meth2();
}

class Test2 implements Test1
{

    @Override
    public void meth1()
    {
        System.out.println("Meth1");
    }

    @Override
    public void meth2()
    {
        System.out.println("meth2");
    }

    public void meth3()
    {
        System.out.println("meth3");
    }
}

public class Main {

    public static void main(String[] args) {
        Test1 t = new Test2();
        t.meth1();
        t.meth2();

        Test2 t2 = new Test2();

    }
}
