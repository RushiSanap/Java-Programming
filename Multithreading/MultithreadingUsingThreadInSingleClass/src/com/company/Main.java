package com.company;

public class Main extends Thread
{
    @Override
    public void run()
    {
        int i = 1;
        while (true)
        {
            System.out.println(i + " Hello");
            i++;
        }
    }

    public static void main(String[] args)
    {
        Main m = new Main();
        m.start();
        int i = 1;
        while (true)
        {
            System.out.println(i + " World");
            i++;
        }
    }
}
