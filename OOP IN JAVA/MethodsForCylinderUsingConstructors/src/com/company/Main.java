package com.company;

class Cylinder
{
    private float radius;
    private float height;

    public void setRadius(float r)
    {
        if(r>0)
            radius = r;
        else
            radius = 0;
    }

    public void setHeight(float h)
    {
        if(h>0)
            height = h;
        else
            height = 0;
    }

    public float getRadius()
    {
        return radius;
    }

    public float getHeight()
    {
        return height;
    }

    public void setDimension(float r, float h)
    {
       setRadius(r);
       setHeight(h);
    }

    public Cylinder()
    {
        radius = 0;
        height = 0;
    }

    public Cylinder(float r)
    {
        setRadius(r);
        setHeight(1);
    }

    public Cylinder(float r, float h)
    {
        setRadius(r);
        setHeight(h);
    }

    public float curvedSurfaceArea()
    {
        return (float) (2*Math.PI*radius*height);
    }

    public float volume()
    {
        return (float) (Math.PI*Math.pow(radius,2)*height);
    }
}

public class Main {

    public static void main(String[] args) {
        Cylinder c = new Cylinder(4,5);
        c.setDimension(2,3);
        System.out.println(c.curvedSurfaceArea());
    }
}
