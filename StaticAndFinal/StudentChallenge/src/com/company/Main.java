package com.company;

import java.util.Date;

class Student
{
    private String rollNumber;

    static private int count = 0;

    private String getRollNumber()
    {
        Date d = new Date();
        String rn = "univ-" + (1900 + d.getYear()) + "-" + count++;
        return rn;
    }

    public Student()
    {
        rollNumber = getRollNumber();
        System.out.println(rollNumber);
    }
}



public class Main {

    public static void main(String[] args) {
        Student s[] = new Student[10];
        s[0] = new Student();
        s[1] = new Student();
        s[2] = new Student();
        s[3] = new Student();

    }
}
