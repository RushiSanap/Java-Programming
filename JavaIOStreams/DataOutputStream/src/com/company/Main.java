package com.company;

import java.io.*;

class Student
{
    int rollNumber;
    String name;
    float avg;
    String department;
}

public class Main {

    public static void main(String[] args) {
        try
        {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\sanap\\Desktop\\Vacation Learning\\JavaIOStreams\\DataOutputStream\\Student.txt");
            DataOutputStream dos = new DataOutputStream(fos);

            Student s = new Student();
            s.rollNumber = 10;
            s.name = "Rushikesh Vinod Sanap";
            s.avg = 87.69f;
            s.department = "CSE";

            dos.writeInt(s.rollNumber);
            dos.writeUTF(s.name);
            dos.writeFloat(s.avg);
            dos.writeUTF(s.department);

            fos.close();
            dos.close();
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}
