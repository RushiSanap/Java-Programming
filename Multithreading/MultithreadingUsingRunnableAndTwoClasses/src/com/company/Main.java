package com.company;

class MyRunnable implements Runnable
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
}

public class Main {

    public static void main(String[] args) {
        MyRunnable m = new MyRunnable();
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
