package com.company;

class MyThread extends Thread{
    public void run()
    {
        int count = 1;
        while (true)
        {
            System.out.println(count++ + " MyThread");
        }

    }
}

public class Main {

    public static void main(String[] args) throws InterruptedException {


        MyThread t = new MyThread();
        t.start();
        //t.setDaemon(true);
        int count = 1;
        while (true)
        {
            System.out.println(count++ + "  Main");
            Thread.yield();
        }

        //Thread mainThread = Thread.currentThread();
       // mainThread.join();
    }
}
