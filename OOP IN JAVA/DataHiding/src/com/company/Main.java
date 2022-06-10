package com.company;

class rectangle
{
    private int length;

    private int breadth;

    public void setLenght(int l)
    {
        if(l>0)
            length = l;
        else
            length = 0;
    }

    public int getLength()
    {
        return length;
    }

    public void setBreadth(int b)
    {
        if(b>0)
            breadth = b;
        else
            breadth = 0;
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

    public boolean isSquare()
    {
        return length == breadth;
    }

}

public class Main {

    public static void main(String[] args) {
        rectangle rec = new rectangle();
        rec.setBreadth(10);
        rec.setLenght(5);
        System.out.println("Area is " + rec.area() + " square unit");
        System.out.println("Perimeter is " + rec.perimeter() + " unit");
        if(rec.isSquare())
            System.out.println("It is a square");
        else
            System.out.println("It is not a square");

    }
}
