package com.company;

class circle
{
    public double radius;
    public double area()
    {
        return Math.PI*radius*radius;
    }
    public double circumference()
    {
        return 2*Math.PI*radius;
    }

}

public class Main {

    public static void main(String[] args) {
        circle obj  = new circle();
        obj.radius = 3.4;
        double x = obj.area();
        double y = obj.circumference();
        System.out.format("Area is %.4f", x);
        System.out.format("\nPerimeter is %.4f", y);
    }
}
