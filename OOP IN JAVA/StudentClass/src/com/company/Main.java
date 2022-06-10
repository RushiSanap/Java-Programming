package com.company;

import java.security.PublicKey;

class Student
{
    public int rollNumber;

    public String name;

    public String courses;

    public int m1,m2,m3;

    public int total()
    {
        return m1+m2+m3;
    }

    public float average()
    {
        return (float)total()/3;
    }

    public char grade()
    {
        if(average() > 60)
            return 'A';
        else
            return 'B';
    }

    public String toString()//tostring method directly give print the content
    {
        return "Details:\n" + "Name = " + name + "\nCourse = " + courses + "\nRoll number = " + rollNumber;
    }
}

public class Main {

    public static void main(String[] args) {
        Student s = new Student();
        s.rollNumber = 111903074;
        s.name = "Rushikesh Vinod Sanap";
        s.courses = "SY Computer engg";
        s.m1 = 56;
        s.m2 = 45;
        s.m3 = 78;

        System.out.println(s);
        System.out.println("Total marks = " + s.total());
        System.out.printf("Average = %.2f\n", s.average());
        System.out.println("Grade = " + s.grade());
    }
}
