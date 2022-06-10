package com.company;

import java.io.*;

class Student
{
    int rollNumber;
    String name;
    String department;
}

public class Main {

    public static void main(String[] args) {
        try
        {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\sanap\\Desktop\\Vacation Learning\\JavaIOStreams\\PrintStreamDemo\\Student.txt");
            PrintStream ps = new PrintStream(fos);
            Student s = new Student();

            s.rollNumber = 10;
            s.name = "Rushikesh Sanap";
            s.department = "CS";

            ps.println(s.rollNumber);
            ps.println(s.name);
            ps.println(s.department);

            fos.close();
            ps.close();
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}
