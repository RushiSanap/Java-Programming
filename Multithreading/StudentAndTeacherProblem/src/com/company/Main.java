package com.company;

class Whiteboard
{
    private String text;
    private int numberOfStudents = 0;
    private int count = 0;

    synchronized public void write(String msg)
    {
        System.out.println("Teacher is writing " + msg);
        while (count != 0)
        {
            try{wait();}catch (Exception e){}
        }
        text = msg;
        count = numberOfStudents;
        notifyAll();
    }

    synchronized public String read()
    {
        while (count == 0)
        {
            try{wait();}catch (Exception e){}
        }
        String t = text;
        count--;
        if(count == 0)
            notify();
        return t;
    }

    public void attendance()
    {
        numberOfStudents++;
    }

}

class Teacher extends Thread
{
    Whiteboard w;
    String note[] = {"Java is a programming language", "It is system independent","It supports multithreading", "It supports OOP","end"};
    public Teacher(Whiteboard w)
    {
        this.w = w;
    }

    public void run()
    {
        for(int i = 0; i < note.length; i++)
        {
            w.write(note[i]);
        }
    }
}

class Students extends Thread
{
    Whiteboard w;
    private String name;
    public Students(Whiteboard w, String name)
    {
        this.w = w;
        this.name = name;
    }

    public void run()
    {
        w.attendance();
        String text;
        do {
            text = w.read();
            System.out.println(name + " reading " + text);
            //System.out.flush();
        }while(!text.equals("end"));
    }
}

public class Main {

    public static void main(String[] args) {
        Whiteboard w = new Whiteboard();
        Teacher t = new Teacher(w);

        Students s1 = new Students(w,"1.Ajay");
        Students s2 = new Students(w, "2.Rushikesh");
        Students s3 = new Students(w, "3.Akash");
        Students s4 = new Students(w, "4.Ritesh");

        t.start();

        s1.start();
        s2.start();
        s3.start();
        s4.start();
    }
}
