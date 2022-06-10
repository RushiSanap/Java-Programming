package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        try
        {
            //FileOutputStream fop = new FileOutputStream("C:/Users/sanap/Desktop/Vacation Learning/JavaIOStreams/IOStreamDemo/Test.txt");
            FileOutputStream fop = new FileOutputStream("C:\\Users\\sanap\\Desktop\\Vacation Learning\\JavaIOStreams\\IOStreamDemo\\test.txt");
            String str = "Java is a programming language";
            fop.write(str.getBytes());
            fop.close();
        }
        catch (IOException e)
        {
            System.out.println(e);
        }

    }
}
