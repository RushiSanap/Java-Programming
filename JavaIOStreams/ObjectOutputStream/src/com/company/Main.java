package com.company;

import java.io.*;

class Student implements Serializable
{
    private int rollNumber;
    private String name;
    private float avg;
    private String department;
    public static int data = 100;
    public transient int t;

    public Student(){}

    public Student(int rollNumber, String name, float avg, String department)
    {
        this.rollNumber = rollNumber;
        this.name = name;
        this.avg = avg;
        this.department = department;
        data = 500;
        t = 100;
    }

    @Override
    public String toString()
    {
        return "Student Details:" +
                "\nRoll Number = " + rollNumber +
                "\nName = " + name +
                "\nAvg = " + avg +
                "\nDepartment = " + department +
                "\nData = " + data +
                "\nt = " + t;
    }
}

public class Main {

    public static void main(String[] args) {
        try
        {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\sanap\\Desktop\\Vacation Learning\\JavaIOStreams\\ObjectOutputStream\\Student.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            Student s = new Student(10, "Rushikesh Sanap", 89.98f, "CSE");
            oos.writeObject(s);

            fos.close();
            oos.close();
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}
