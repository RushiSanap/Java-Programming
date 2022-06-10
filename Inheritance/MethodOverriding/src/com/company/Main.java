package com.company;

class Parent
{
    public void display()
    {
        System.out.println("Hello");
    }
}

class Child extends Parent
{
    @Override
    public void display()
    {
        System.out.println("Hello Welcome");
    }
}

public class Main {

    public static void main(String[] args) {
        Parent p = new Parent();
        p.display();

        Child c = new Child();
        c.display();

        Parent pa = new Child();
        pa.display();
    }
}
