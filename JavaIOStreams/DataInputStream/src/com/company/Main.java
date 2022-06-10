package com.company;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

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
           FileInputStream fis = new FileInputStream("C:\\Users\\sanap\\Desktop\\Vacation Learning\\JavaIOStreams\\DataOutputStream\\Student.txt");
           DataInputStream dis = new DataInputStream(fis);

           Student s = new Student();

           s.rollNumber = dis.readInt();
           s.name = dis.readUTF();
           s.avg = dis.readFloat();
           s.department = dis.readUTF();

           System.out.println("Roll Number = " + s.rollNumber);
           System.out.println("Name = " + s.name);
           System.out.println("Average = " + s.avg);
           System.out.println("Department = " + s.department);

           fis.close();
           dis.close();
       }
       catch(IOException e)
       {
           System.out.println(e);
       }
    }
}
