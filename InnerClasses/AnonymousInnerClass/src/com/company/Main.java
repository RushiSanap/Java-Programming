package com.company;

abstract class Test
{
    abstract public void display();
}

interface Testing
{
    void show();
}

class Test1
{
    public void method1()
    {
        //abstract class object cannot be created but we can override the methods of abstract class
        Test t = new Test()
        {
            @Override
            public void display()
            {
                System.out.println("Hello World");
            }
        };//semicolon is necessary
        t.display();
    }

    public void method2()
    {
        new Test()
        {
            @Override
            public void display()
            {
               System.out.println("Second Time Hello World");
            }
        }.display();
    }

    public void method3()
    {
        new Testing()
        {
            @Override
            public void show()
            {
                System.out.println("Third Time Hello World");
            }
        }.show();
    }

}
public class Main {

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.method1();
        t.method2();
        t.method3();
    }
}
