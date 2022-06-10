package com.company;

class Rectangle
{
    private int length;

    private int breadth;

    protected int x = 10;

    Rectangle(int length, int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    int area()//by default data members or the attributes are public
    {
        return length*breadth;
    }
}

class Cuboid extends Rectangle
{
    private int height;

    protected int x = 20;

    public Cuboid(int l, int b, int h)
    {
        super(l,b);//it is mandatory
        height = h;
    }

    public int volume()
    {
        return area()*height;
    }

    public void display()
    {
        System.out.println("Parent class x = " + super.x);//super keyword will access the value of the parent class variable
        System.out.println("Child class x = " + x);
    }
}

public class Main {

    public static void main(String[] args) {
        Cuboid c = new Cuboid(10,20,30);
        c.display();
        System.out.println(c.area());
    }
}
