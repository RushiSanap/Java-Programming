package com.company;

class MyThread extends Thread{
    public MyThread(String name)
    {
        super(name);
    }

    public void run()
    {
        try
        {
            int count = 1;
            while(true)
            {
                System.out.println(count++);
                Thread.sleep(200);
            }
        }
        catch (InterruptedException e)
        {
           System.out.println(e);
        }


    }
}

public class Main {

    public static void main(String[] args) {

        MyThread t = new MyThread("My Thread 1");

        t.start();

        t.interrupt();
    }
}
