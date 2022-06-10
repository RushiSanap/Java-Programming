package com.company;

abstract class Shape
{
    abstract public float perimeter();

    abstract public float area();
}

class Circle extends Shape
{
    private float radius;

    public void setRadius(float radius)
    {
        this.radius = radius;
    }

    public float getRadius()
    {
        return radius;
    }

    @Override
    public float perimeter()
    {
        return (float) (2*Math.PI*radius);
    }

    @Override
    public float area()
    {
        return (float) (Math.PI*radius*radius);
    }

    public float circumference()
    {
        return perimeter();
    }
}

class Rectangle extends Shape
{
    private int length;

    private int breadth;

    public Rectangle(int length, int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public float perimeter()
    {
        return 2*(length+breadth);
    }

    @Override
    public float area()
    {
        return length*breadth;
    }
}

public class Main {

    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(1);
        System.out.println("Circle Area = " + c.area());

        Shape r = new Rectangle(10,4);
        System.out.println("Rectangle Area = " + r.area());
    }
}
