package com.company;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try
        {
            FileInputStream fis = new FileInputStream("C:\\Users\\sanap\\Desktop\\Vacation Learning\\JavaIOStreams\\BufferedInputStream\\Test.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);

            System.out.println("File " + fis.markSupported());
            System.out.println("Buffer " + bis.markSupported());

            System.out.print((char)bis.read());
            System.out.print((char)bis.read());
            System.out.print((char)bis.read());

            bis.mark(10);

            System.out.print((char)bis.read());
            System.out.print((char)bis.read());

            bis.reset();

            System.out.print((char)bis.read());
            System.out.print((char)bis.read());

            bis.close();
            fis.close();
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}