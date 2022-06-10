package com.company;

public class Main {

    int max(int x, int y)
    {
        if(x>y)
            return x;
        else
            return y;
    }

    static void inc(int x)
    {
        x++;
        System.out.println(x);
    }

    public static void main(String[] args) {

	    int x = 10, y = 15;
	    Main method  = new Main();
	    //System.out.println(method.max(x,y));
	    //System.out.println(max(x,y))
        inc(x);
        System.out.println(x);
    }
}
