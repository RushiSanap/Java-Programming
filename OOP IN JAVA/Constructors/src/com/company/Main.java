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
        setLength(l);
        setBreadth(b);
    }

    public Rectangle(int s)
    {
        length = breadth = s;
    }

    public void setLength(int l)
    {
        if(l > 0)
            length = l;
        else
            length = 1;
    }

    public void setBreadth(int b)
    {
        if(b > 0)
            breadth = b;
        else
            breadth = 1;
    }

    public int getLength()
    {
        return length;
    }

    public int getBreadth()
    {
        return breadth;
    }

    public int area()
    {
        return length*breadth;
    }

    public int perimeter()
    {
        return 2*(length + breadth);
    }

}

public class Main {

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        System.out.println(r.area());
        System.out.println(r.perimeter());
    }
}
