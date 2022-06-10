package com.company;

class Rectangle
{
    private int length;

    private int breadth;

    public Rectangle()
    {
        length = 1;
        breadth = 1;
    }

    public Rectangle(int l, int b)
    {
        length = l;
        breadth = b;
    }

    public int area()
    {
        return length*breadth;
    }
}

class Cuboid extends Rectangle
{
    private int height;

    public Cuboid()
    {
        height = 1;

    }

    public Cuboid(int h)
    {
        height = h;
    }

    public Cuboid(int l, int b, int h)
    {
        super(l,b);
        height = h;
    }

    public int volume()
    {
        return area()*height;
    }
}

public class Main {

    public static void main(String[] args) {
        Cuboid c = new Cuboid(10,20,30);
        System.out.println(c.volume());
    }
}
