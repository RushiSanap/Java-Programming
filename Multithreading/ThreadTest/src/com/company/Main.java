package com.company;

class MyThread extends Thread
{
    public MyThread(String name)
    {
        super(name);
        setPriority(Thread.MAX_PRIORITY);
    }
}

public class Main {

    public static void main(String[] args) {
        MyThread t = new MyThread("My thread 1");
        System.out.println("ID = " + t.getId());
        System.out.println("Name = " + t.getName());
        System.out.println("Priority = " + t.getPriority());
        t.start();
        System.out.println("State = " + t.getState());
        System.out.println("Alive = " + t.isAlive());

    }
}
