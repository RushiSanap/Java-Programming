package com.company;

interface Test1
{
    final static int X = 10;
    //we can define properties with variable name in Capital
    //they are by default final and static

    abstract public void meth1();
    //methods of interfaces are by default public and abstract
    //we can simply write it as void meth1()

    abstract public void meth2();

    public default void meth3()
    {
        System.out.println("Default Meth3 of Interface Test1");
    }

    public static void meth4()
    {
        System.out.println("Static Meth4 of Interface Test1");
    }

}

interface Test2 extends Test1
{
    void meth5();
}

class Test3 implements Test2
{

    @Override
    public void meth3()
    {
        System.out.println("Meth3 of Test2");
    }

    @Override
    public void meth1()
    {
        System.out.println("Meth1 of Test3");
    }

    @Override
    public void meth2()
    {
        System.out.println("Meth2 of Test3");
    }

    @Override
    public void meth5()
    {
        System.out.println("Meth5 of Test3");
    }
}


public class Main {

    public static void main(String[] args) {
	    System.out.println(Test3.X);
	    Test1.meth4();
        Test3 t = new Test3();

    }
}
