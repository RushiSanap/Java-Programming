package com.company;

class rectangle
{
    public int length;

    public int breadth;

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
        rec.length = 4;
        rec.breadth = 4;
        System.out.println("Area is " + rec.area() + " square unit");
        System.out.println("Perimeter is " + rec.perimeter() + " unit");
        if(rec.isSquare())
            System.out.println("It is a square");
        else
            System.out.println("It is not a square");

    }
}
