package com.company;

class Student
{
    private int rollNumber;

    private String name;

    private String department;

    private  int count;

    private String[] subjects = new String[10];

    public void setDepartment(String department)
    {
        this.department = department;
    }

    public void setSubjects(String ...s)
    {
        count = 0;
        for(int i = 0; i < s.length; i++)
        {
            subjects[i] = s[i];
            count++;
        }
    }

    public int getRollNumber()
    {
        return rollNumber;
    }

    public String getDepartment()
    {
        return department;
    }

    public String getName()
    {
        return name;
    }

    public void getSubject()
    {
        for(int i = 0; i < count; i++)
            System.out.println(subjects[i]);
    }

    public Student(int rollNumber, String name, String department)
    {
        this.rollNumber = rollNumber;
        this.name = name;
        this.department = department;
    }

    public String toString()
    {
        return "\nStudent Details:" + "\nRoll Number = " + rollNumber + "\nName = " + name + "\nDepartment = " + department;
    }
}

public class Main {

    public static void main(String[] args) {
        Student std[] = new Student[3];
        std[0] = new Student(111903074, "Rushikesh Sanap", "CS");
        std[1] = new Student(111903056, "Omkar Sonamwane", "CS");
        std[2] = new Student(111903069, "Ritik Naik", "CS");
        std[0].setSubjects("DSA", "TOC", "PPL", "PPS", "MPT");
        std[0].getSubject();

        //for(Student y:std)
            //System.out.println(y);
    }
}
