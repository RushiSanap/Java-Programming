package com.company;

public class Main implements Runnable
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
        Thread t = new Thread(m);
        t.start();
        int i = 1;
        while (true)
        {
            System.out.println(i + " World");
            i++;
        }
    }


}
