package com.company;

@FunctionalInterface
interface MyLambda
{
    public void display();
}

class UseLambda
{
    public void callLambda(MyLambda ml)
    {
        ml.display();
    }
}

class My
{
    public void method()
    {
        //local variable of the method must be final or effectively final
        final int count  = 0;
        MyLambda m = ()->
        {
            int x = 0;
            x++;
            System.out.println("Hii");
            System.out.println("Hello");
            System.out.println(count);
        };
    }
}

class Demo
{
    public void method()
    {
        UseLambda ul = new UseLambda();
        ul.callLambda(()->{System.out.println("Hello");});
    }
}

public class Main {

    public static void main(String[] args) {
        Demo d = new Demo();
        d.method();
    }
}
