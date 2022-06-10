package com.company;

import java.lang.reflect.GenericArrayType;

class Parent
{
    public Parent()
    {
        System.out.println("Class Parent");
    }
}

class Child extends Parent
{
    public Child()
    {
        System.out.println("Class Child");
    }
}

class GrandChild extends Child
{
    public GrandChild()
    {
        System.out.println("Class GrandChild");
    }
}

public class Main {

    public static void main(String[] args) {
        GrandChild g = new GrandChild();
    }
}
