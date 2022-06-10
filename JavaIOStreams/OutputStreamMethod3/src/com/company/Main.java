package com.company;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Main {

    public static void main(String[] args) {
        try

        {
            FileOutputStream fop = new FileOutputStream("C:\\Users\\sanap\\Desktop\\Vacation Learning\\JavaIOStreams\\OutputStreamMethod3\\Test.txt");
            String str = "Java is a programming language";
            for(int i = 0; i < str.length() ; i++)
                fop.write((byte)str.charAt(i));
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}
