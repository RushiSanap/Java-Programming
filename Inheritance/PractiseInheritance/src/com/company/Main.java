package com.company;

class Circle
{
    private float radius;

    public Circle()
    {
        radius = 0f;
    }

    public float area()
    {
        return (float) (Math.PI*radius*radius);
    }

    public float circumference()
    {
        return (float) (2*Math.PI*radius);
    }

    public void setRadius(int r)
    {
        radius = r;
    }

    public float getRadius()
    {
        return radius;
    }
}

class Cylinder extends Circle
{
    private float height;

    public Cylinder()
    {
        height = 0f;
    }

    public float volume()
    {
        return area()*height;
    }

    public float curvedSurfaceArea()
    {
        return circumference()*height;
    }

    public void setHeight(int h)
    {
        height = h;
    }

    public float getHeight()
    {
        return height;
    }
}

public class Main {

    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.setRadius(7);
        c.setHeight(10);
        System.out.println("Volume of Cylinder = " + c.volume());

    }
}
