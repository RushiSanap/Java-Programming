package com.company;

import java.util.concurrent.CyclicBarrier;

class Cylinder
{
    public double height;

    public double radius;

    public double totalSurfaceArea()
    {
        return Math.PI*Math.pow(radius,2) + 2*Math.PI*radius*height;
    }

    public double curvedSurfaceArea()
    {
        return 2*Math.PI *radius*height;
    }

    public double volume()
    {
        return Math.PI*radius*radius*height;
    }
}

public class Main {

    public static void main(String[] args) {
        Cylinder cyl = new Cylinder();
        cyl.height = 3.5;
        cyl.radius = 5.6;
        System.out.printf("Total Surface Area = %.4f", cyl.totalSurfaceArea());
        System.out.printf("\nCurved surface area = %.4f", cyl.curvedSurfaceArea());
        System.out.printf("\nTotal volume = %.4f", cyl.volume());

        /*
        Total Surface Area = 221.6708
        Curved surface area = 123.1504
        Total volume = 344.8212
        */
    }
}
