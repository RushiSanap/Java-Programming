package com.company;
//inter-thread Communication
class MyData
{
    private int value;

    private boolean flag = true;

    synchronized public void setValue(int value) {
        while (flag != true)
        {
            try { wait();} catch (Exception e){}

        }
        this.value = value;
        flag = false;
        notify();
    }

    synchronized public int getValue()
    {
        int x = 0;
        while (flag != false)
        {
            try { wait();} catch (Exception e){}

        }
        x = value;
        flag = true;
        notify();
        return x;
    }
}

class Producer extends Thread
{
    MyData d;

    public Producer(MyData d)
    {
        this.d = d;
    }

    public void run() {
        int i = 0;
        while (true)
        {
            d.setValue(i);
            System.out.println("Producer" + i);
            i++;
        }
    }
}

class Consumer extends Thread
{
    MyData d;

    public Consumer(MyData d)
    {
        this.d = d;
    }

    public void run()
    {
        while (true)
        {
            System.out.println("Consumer" + d.getValue());
        }
    }
}

public class Main {

    public static void main(String[] args) {
        MyData d = new MyData();

        Producer p = new Producer(d);
        Consumer c = new Consumer(d);

        p.start();
        c.start();

    }
}
