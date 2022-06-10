package com.company;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class Producer extends Thread
{
    private PipedOutputStream pos;
    public Producer(PipedOutputStream os)
    {
        pos = os;
    }

    public void run()
    {
        int count = 0;
        while (true)
        {
            try{
                pos.write(count);
                pos.flush();
                System.out.println("Producer " + count);
                System.out.flush();
                Thread.sleep(10);
                count++;
            }
            catch (Exception e){}

        }
    }
}

class Consumer extends Thread
{
    private PipedInputStream pis;
    public Consumer(PipedInputStream is)
    {
        pis = is;
    }

    public void run()
    {
        int x;
        while (true)
        {
            try{
                x = pis.read();
                System.out.println("Consumer " + x);
                System.out.flush();
                Thread.sleep(10);
            }
            catch (Exception e){}

        }
    }
}

public class Main {

    public static void main(String[] args) throws IOException {
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();

        pos.connect(pis);
        Producer p = new Producer(pos);
        Consumer c = new Consumer(pis);

        p.start();
        c.start();
    }
}
