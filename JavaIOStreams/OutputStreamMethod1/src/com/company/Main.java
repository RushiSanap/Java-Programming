package com.company;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Main {

    public static void main(String[] args) {
        try
        {
            FileOutputStream fop = new FileOutputStream("C:\\Users\\sanap\\Desktop\\Vacation Learning\\JavaIOStreams\\OutputStreamMethod1\\Test.txt");
            String str = "Java is a programming language";
            fop.write(str.getBytes());
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}
