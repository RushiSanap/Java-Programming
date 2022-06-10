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
            FileReader fis = new FileReader("C:\\Users\\sanap\\Desktop\\Vacation Learning\\JavaIOStreams\\PrintStreamDemo\\Student.txt");
            BufferedReader bis = new BufferedReader(fis);

            Student st = new Student();

            st.rollNumber = Integer.parseInt(bis.readLine());
            st.name = bis.readLine();
            st.department = bis.readLine();

            System.out.println("Roll Number = " + st.rollNumber);
            System.out.println("Name = " + st.name);
            System.out.println("Department = " + st.department);

            bis.close();
            bis.close();


        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}
