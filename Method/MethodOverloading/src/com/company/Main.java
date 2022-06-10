package com.company;

public class Main {

    static int max(int x, int y)
    {
        return x > y ? x : y;
    }

    static float max(float x, float y)
    {
        return x > y?x : y;
    }

    static int max(int x, int y, int  z)
    {
        return x > y && x > z ? x :(y > z ? y : z);
    }
    public static void main(String[] args) {
        float x = 4f,y = 6.5f;
        System.out.println(max(x,y));
    }
}
