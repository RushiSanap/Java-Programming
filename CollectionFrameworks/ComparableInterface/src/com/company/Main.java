package com.company;

import java.util.TreeSet;

class Point implements Comparable
{
    int x;
    int y;
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public String toString()
    {
        return "x = " + x + " y = " + y;
    }

    @Override
    public int compareTo(Object o)
    {
        Point p = (Point)o;
        if(this.x < p.x)
            return -1;
        else if(this.x > p.x)
            return 1;
        else
        {
            if(this.y < p.y)
                return -1;
            else if(this.y > p.y)
                return 1;
            else
                return 0;
        }
    }
}

public class Main {

    public static void main(String[] args) {

        TreeSet<Point> ts = new TreeSet<Point>();

        ts.add(new Point(1,1));
        ts.add(new Point(1,2));
        ts.add(new Point(2,3));
        ts.add(new Point(1,6));

        System.out.println(ts);
    }
}
