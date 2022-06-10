package com.company;

class Parent
{
    public Parent()
    {
        System.out.println("Non-Parametrised Constructor of Parent Class");
    }

    public Parent(int x)
    {
        System.out.println("Parametrised Constructor of Parent Class");
    }
}

class Child extends Parent
{
    public Child()
    {
        System.out.println("Non-Parametrised Constructors of Child Class");
    }

    public Child(int x)
    {
        System.out.println("Parametrised Constructor of child class");
    }

    public Child(int x, int y)
    {
        super(x);
        System.out.println("Non-parametrised 2 constructor of child class");
    }
}

public class Main {

    public static void main(String[] args) {
        Child c = new Child(10, 20);
    }
}
