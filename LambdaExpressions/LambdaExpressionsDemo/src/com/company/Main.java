package com.company;

@FunctionalInterface
interface MyLambda
{
    public void display();
}

/* class My implements MyLambda
{
    @Override
    public void display()
    {
        System.out.println("Hello World");
    }
}
 */

public class Main {

    public static void main(String[] args) {
        /*My m = new My();
        m.display();*/

        MyLambda l = () -> { System.out.println("Hello world"); };
        l.display();

    }
}
